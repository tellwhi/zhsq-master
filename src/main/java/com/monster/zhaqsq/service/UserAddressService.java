package com.monster.zhaqsq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monster.zhaqsq.bean.UserAddress;
import com.monster.zhaqsq.dao.UserAddressMapper;


@Service
public class UserAddressService {

	@Autowired	
	UserAddressMapper userAddressMapper;
	
	/*
	 * 查询用户地址
	 */
	public UserAddress getAd(String userName) {
		return userAddressMapper.selectWithUsername(userName);
	}
	
	/*
	 * 删除用户地址
	 */
	public void deleteAd(String userName) {
		userAddressMapper.deleteWithUsername(userName);
	}
	
	/*
	 * 修改用户地址
	 */
	public void updateAd(String address, String userName) {
		userAddressMapper.updateOnlyAddress(address, userName);
	}
	
	/*
	 * 插入用户地址
	 */
	public void saveAd(UserAddress userAddress) {
		userAddressMapper.insert(userAddress);
	}
	
}
