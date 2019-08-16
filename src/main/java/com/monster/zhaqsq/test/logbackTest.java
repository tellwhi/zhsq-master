package com.monster.zhaqsq.test;

import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.utils.cookieUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @auther: Monster
 * @date: 2019/8/15
 * @description:
 */
@Controller
public class logbackTest {

    private final Logger logger =  LoggerFactory.getLogger(logbackTest.class);

    @RequestMapping("/logbacktest")
    @ResponseBody
    public Msg logbacktest(HttpServletResponse response, HttpServletRequest request) throws Exception {
        String userType = cookieUtils.getUserType(request);
        String userId = cookieUtils.getUserId(request);
        String className = this.getClass().getName();
        String userResquest = request.getQueryString();
        logger.warn("用户类别为{}，用户ID为{}的用户操作了{}，request参数为{}.", userType, userId, className,userResquest);
        return Msg.success();
    }
}
