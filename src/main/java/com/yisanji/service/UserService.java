package com.yisanji.service;

import java.util.List;

import com.yisanji.pojo.User;

public interface UserService {
	public User getUserById(int userId);
	public boolean insertUser(User user);
	public List<User> showUsers(int index, int offset);
}
