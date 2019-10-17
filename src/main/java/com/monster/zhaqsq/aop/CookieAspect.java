package com.monster.zhaqsq.aop;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.monster.zhaqsq.utils.cookieUtils;

@Aspect
@Component
public class CookieAspect {

	
	@Pointcut("execution(* com.monster.zhaqsq.controller.CallListController.*(..))")
	public void pointcut(){}
	
	@Before("pointcut()")//ServiceImpl.*.*(..))")
    public void before() throws Throwable {
        //System.out.println("LogAdvice before advice ");
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		String a = cookieUtils.getUserType(request);
		System.out.println(a);
		
    }
	
}
