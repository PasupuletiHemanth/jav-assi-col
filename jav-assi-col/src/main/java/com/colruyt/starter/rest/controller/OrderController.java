package com.colruyt.starter.rest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colruyt.starter.model.Order;
import com.colruyt.starter.service.OrderService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@RequestMapping("/hello")
	public String sayHello()
	{
		return "Hello";
	}
	
	@RequestMapping("/orders")
	public List<Order> getAllStudents()
	{
		return orderService.getAllOrders();
	}
	
	
	@RequestMapping("/order/{orderNo}")
	public Order getOrderByOrderNo(@PathVariable String OrderNo)
	{
		return orderService.getOrderByOrderNo(OrderNo);
	}

}
