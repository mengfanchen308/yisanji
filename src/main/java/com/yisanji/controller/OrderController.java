package com.yisanji.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yisanji.service.OrderService;

@RequestMapping("/order")
@Controller
public class OrderController {
	
	@Resource  
    private OrderService os;
      
    @RequestMapping(value="", method = RequestMethod.GET, produces = "application/xhtml+xml;charset=utf-8")
    public String listOrderFeatures(HttpServletRequest request) {
    	return "order";
    }
	
	

}
