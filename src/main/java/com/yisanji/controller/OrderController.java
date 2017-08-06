package com.yisanji.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.yisanji.pojo.Order;
import com.yisanji.service.OrderService;

@Controller  
@RequestMapping("/order")  
@ResponseBody
public class OrderController {  
    @Resource  
    private OrderService os;
      
    @RequestMapping(value="", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public String showOrder(HttpServletRequest request) {
    	String status = request.getParameter("status");
    	List<Order> order = os.getOrderByStatus(status);
    	return JSON.toJSONString(order);
    }
    
    @RequestMapping(value="", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    // 使用spring mvc 直接生成bean
    public String updateOrder(Order or) {
    	if (os.insertOrder(or))
    		return "success";
    	else
    		return "fail";
    }
}  
