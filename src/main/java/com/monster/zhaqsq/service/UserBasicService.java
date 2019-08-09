package com.monster.zhaqsq.service;

import com.monster.zhaqsq.bean.UserBasic;
import com.monster.zhaqsq.dao.UserBasicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBasicService {

    @Autowired
    UserBasicMapper userbasicMapper;

    /**
     * 获取用户信息
     */
    public List<UserBasic> getall(){
        List<UserBasic> userList = userbasicMapper.selectByExample(null);
        return userList;
    }

    /**
     * 获取用户个人信息
     */
    public List<UserBasic> getinfo() {
        List<UserBasic> userpiList = userbasicMapper.selectPersonalInfoByExample(null);
        return userpiList;
    }
    
    
    /**
     * 根据username查询
     */
    public UserBasic getWithUserName(String userName) {
    	return userbasicMapper.selectByUserName(userName);
    }

    /**
     * 更新用户信息
     */
    public void updateInfo(UserBasic userbasic) {
        userbasicMapper.updateByPrimaryKeySelective(userbasic);
    }

    /**
     * 删除用户
     */
    public void deleteuser(int uid){
        userbasicMapper.deleteByPrimaryKey(uid);
    }

    /**
     * 用户注册
     */
    public void register(String username, String password,String phonenumber){
        userbasicMapper.insertSelective(new UserBasic(null, username, password, phonenumber , null, null, null, null, null, null, null));
    }

}