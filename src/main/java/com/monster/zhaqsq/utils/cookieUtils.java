package com.monster.zhaqsq.utils;

import com.monster.zhaqsq.utils.encryptUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @auther: Monster
 * @date: 2019/8/11
 * @description:cookie封装类
 */
public class cookieUtils {
    static byte[] key = {-22, -14, 74, -23, -29, 94, 103, 47};
    static String UserId;
    static String UserType;


    /**
     * 登陆时 设置用户cookie
     * @param userid 用户id
     * @param usertype 用户类型
     */

    public static void setCookie(String userid, String usertype, HttpServletResponse response) throws Exception{
        Date currentTime = new Date();
        byte[] uid = encryptUtils.encrypt(userid.getBytes(), key);
        byte[] uty = encryptUtils.encrypt(usertype.getBytes(), key);

        try {
            UserId = base64.encode(uid);
            UserType = base64.encode(uty);
        }
        catch (Exception e) {
            throw new Exception(e);
        }

        Cookie time = new Cookie("time", currentTime.toString());
        Cookie userId = new Cookie("userid", UserId);
        Cookie userTpye = new Cookie("usertype", UserType);
        time.setPath("/");
        userId.setPath("/");
        userTpye.setPath("/");
        response.addCookie(time);
        response.addCookie(userId);
        response.addCookie(userTpye);
    }

    /**
     * 获取用户id
     * @param request 用户HttpRequest
     * @return 用户id
     */
    public static String getUserId(HttpServletRequest request) throws Exception{
        Cookie[] cookies=request.getCookies();
        for(Cookie cookie:cookies){
            String name=cookie.getName();
            String value=cookie.getValue();
            if(name.equals("userid")){
                return new String(encryptUtils.decrypt(base64.decode(value.toCharArray()), key));
            }
        }
        return null;
    }

    /**
     * 获取用户类型
     * @param request 用户HttpRequest
     * @return 用户类型
     */
    public static String getUserType(HttpServletRequest request) throws Exception{
        Cookie[] cookies=request.getCookies();
        for(Cookie cookie:cookies){
            String name=cookie.getName();
            String value=cookie.getValue();
            if(name.equals("usertype")){
                return new String(encryptUtils.decrypt(base64.decode(value.toCharArray()), key));
            }
        }
        return null;
    }

    /**
     * 获取用户登陆时间
     * @param request 用户HttpRequest
     * @return 登陆时间
     */
    public static String getTime(HttpServletRequest request) throws Exception{
        Cookie[] cookies=request.getCookies();
        for(Cookie cookie:cookies){
            String name=cookie.getName();
            String value=cookie.getValue();
            if(name.equals("time")){
                return value;
            }
        }
        return null;
    }



    public static void clearCookie(HttpServletRequest request,HttpServletResponse response){
        Cookie[] cookies=request.getCookies();

        for(Cookie cookie: cookies){
            cookie.setMaxAge(0);
            cookie.setPath("/");
            response.addCookie(cookie);
        }


    }

}
