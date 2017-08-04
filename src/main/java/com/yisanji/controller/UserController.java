package com.yisanji.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.yisanji.pojo.User;
import com.yisanji.service.UserService;

@Controller  
@RequestMapping("/user")  
@ResponseBody
public class UserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/showUser")  
    public String showUser(HttpServletRequest request) {
    	User user = userService.getUserById(0);
    	return JSON.toJSONString(user);
    }
    
    @RequestMapping("/showUserById")
    public String showUserById(HttpServletRequest request) {
    	User user = userService.getUserById(Integer.valueOf(request.getParameter("id")));
    	return JSON.toJSONString(user);
    }
}  
