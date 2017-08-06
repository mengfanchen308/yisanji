package com.yisanji.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yisanji.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
	
	List<User> selectByIndex(@Param("index")Integer index, @Param("offset")Integer offset);

}