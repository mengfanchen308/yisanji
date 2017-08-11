package com.yisanji.controller.rest;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.yisanji.pojo.FormatOut;
import com.yisanji.pojo.Order;
import com.yisanji.service.OrderService;

@Controller  
@RequestMapping("/rest/order")  
@ResponseBody
public class RestOrderController {  
    @Resource  
    private OrderService os;
      
    @RequestMapping(value="", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public String showOrder(@RequestParam(value = "status", required = false) String status,HttpServletRequest request) {
    	List<Order> order = os.getOrderByStatus(status);
    	return FormatOut.format(JSON.toJSONString(order), "1", FormatOut.handleMessage("查询成功", "query success!"));
    }
    
    @RequestMapping(value="", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    // 使用spring mvc 直接生成bean
    public String updateOrder(Order or) {
    	or.setId(UUID.randomUUID().toString());
    	if (os.insertOrder(or))
    		return FormatOut.format("", "1", FormatOut.handleMessage("注册成功", "regist fail!"));
    	else
    		return FormatOut.format("", "0", FormatOut.handleMessage("注册失败", "regist fail!"));
    }
}  
