package com.yisanji.service;

import java.util.List;
import com.yisanji.pojo.Order;

public interface OrderService {
	public Order getOrderById(String id);
	public List<Order> getOrderByStatus(String status);
	public boolean insertOrder(Order or);

}
