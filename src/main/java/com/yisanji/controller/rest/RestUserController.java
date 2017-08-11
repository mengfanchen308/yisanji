package com.yisanji.controller.rest;

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
@RequestMapping("/rest/user")  
@ResponseBody
public class RestUserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping(value="", method = RequestMethod.GET, produces = "application/json;charset=utf-8")  
    public String showUser(HttpServletRequest request) {
    	List<User> us = userService.showUsers(1, 1);
    	return FormatOut.format(JSON.toJSONString(us), "1", FormatOut.handleMessage("查询成功", "query success!"));
    }
    
    @RequestMapping("/showUserById")
    public String showUserById(HttpServletRequest request) {
    	User user = userService.getUserById(Integer.valueOf(request.getParameter("id")));
    	return JSON.toJSONString(user);
    }
    
    @RequestMapping(value="", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public String registUser(User us) {
    	if (userService.insertUser(us))
    		return FormatOut.format("", "1", FormatOut.handleMessage("注册成功", "regist success!"));
    	else
    		return FormatOut.format("", "0", FormatOut.handleMessage("注册失败", "regist fail!"));
    }
}  
