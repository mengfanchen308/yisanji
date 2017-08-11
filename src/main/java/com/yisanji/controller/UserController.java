package com.yisanji.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yisanji.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {
	
	@Resource  
    private UserService os;
      
    @RequestMapping(value="", method = RequestMethod.GET, produces = "application/xhtml+xml;charset=utf-8")
    public String listUserFeatures(HttpServletRequest request) {
    	return "user";
    }
	
	

}
