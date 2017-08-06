package com.yisanji.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.yisanji.dao.UserMapper;
import com.yisanji.pojo.User;
import com.yisanji.service.UserService;

@Service("userService") 
public class UserServiceImpl implements UserService{
	public static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	@Resource
	private UserMapper um;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.um.selectByPrimaryKey(userId);
	}

	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		try {
			if(user.getId() != null)
				return false;
			um.insertSelective(user);
			return true;
		}
		catch (Exception e){
			LOGGER.info(e.toString());
		}
		
		return false;
	}

	@Override
	public List<User> showUsers(int index, int offset) {
		return um.selectByIndex(index, offset);
	}

}
