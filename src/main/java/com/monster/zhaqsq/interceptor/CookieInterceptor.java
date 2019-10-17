package com.monster.zhaqsq.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.utils.cookieUtils;

public class CookieInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		//System.out.println(cookieUtils.getUserType(request));
		boolean judge;
		
		if (request.getCookies()==null||cookieUtils.getUserType(request)==null) {
			judge = false;
		}
		else {
			if (cookieUtils.getUserType(request).equals("1")) {
				if (cookieUtils.userLoginTimeStatus(request)) {
					judge = true;
				} 
				else {
					cookieUtils.clearCookie(request, response);
					judge = false;
				}
			} 
			else if (cookieUtils.getUserType(request).equals("2")) {
				if (cookieUtils.adminLoginTimeStatus(request)) {
					judge = true;
				} 
				else {
					cookieUtils.clearCookie(request, response);
					judge = false;
				}
			} 
			else {
				judge = false;
			}
		}
		if (judge==true) {
			return true;
		}
		else {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//          String url = "/industryiot/Login.html";
//          response.sendRedirect(url);

			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/json; charset=utf-8");
			String msg = JSON.toJSONString(Msg.fail());
			PrintWriter out = null;
			out = response.getWriter();
			out.write(msg);
			out.flush();
			out.close();
			return false;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println(cookieUtils.getUserType(request));
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
