package com.yisanji.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.yisanji.dao.OrderMapper;
import com.yisanji.pojo.Order;
import com.yisanji.service.OrderService;

@Service("orderService") 
public class OrderServiceImpl implements OrderService{
	
	public static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);
	@Resource
	private OrderMapper om;

	@Override
	public Order getOrderById(String id) {
		return om.selectByPrimaryKey(id);
	}

	@Override
	public List<Order> getOrderByStatus(String status) {
		return om.selectByStatus(status);
	}

	@Override
	public boolean insertOrder(Order or) {
		try {
			if (or.getStatus()!=null)
				om.insertSelective(or);
				return true;
		}
		catch (Exception e){
			LOGGER.info(e.toString());
		}
		
		return false;
	}

}
