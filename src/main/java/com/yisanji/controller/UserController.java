package com.yisanji.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.yisanji.pojo.FormatOut;
import com.yisanji.pojo.User;
import com.yisanji.service.UserService;

@Controller  
@RequestMapping("/user")  
@ResponseBody
public class UserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping(value="", method = RequestMethod.GET, produces = "application/json;charset=utf-8")  
    public String showUser(HttpServletRequest request) {
    	List<User> us = userService.showUsers(1, 1);
    	return JSON.toJSONString(us);
    }
    
    @RequestMapping("/showUserById")
    public String showUserById(HttpServletRequest request) {
    	User user = userService.getUserById(Integer.valueOf(request.getParameter("id")));
    	return JSON.toJSONString(user);
    }
    
    @RequestMapping(value="", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public String registUser(User us) {
    	if (userService.insertUser(us))
    		return FormatOut.format("", "1", FormatOut.handleMessage("×¢²á³É¹¦", "regist success!"));
    	else
    		return FormatOut.format("", "0", FormatOut.handleMessage("×¢²áÊ§°Ü", "regist fail!"));
    }
}  
