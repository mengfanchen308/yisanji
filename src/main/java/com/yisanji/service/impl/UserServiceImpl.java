package com.yisanji.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yisanji.dao.UserMapper;
import com.yisanji.pojo.User;
import com.yisanji.service.UserService;

@Service("userService") 
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper um;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.um.selectByPrimaryKey(userId);
	}

}
