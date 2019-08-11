package com.monster.zhaqsq.test;

import com.monster.zhaqsq.bean.Msg;

import com.monster.zhaqsq.utils.cookieUtils;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @auther: Monster
 * @date: 2019/8/11
 * @description:
 */



@Controller
@RequestMapping("/cookie")
public class cookieTest {
    @ResponseBody
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Msg a(HttpServletRequest request, HttpServletResponse response) throws Exception{
        cookieUtils.setCookie("123456","admin",response);
        return Msg.success().add("time",cookieUtils.getTime(request)).add("userid",cookieUtils.getUserId(request)).add("usertype",cookieUtils.getUserType(request));
    }
}
