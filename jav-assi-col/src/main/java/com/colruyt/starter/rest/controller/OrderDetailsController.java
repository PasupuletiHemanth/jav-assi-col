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
import com.colruyt.starter.model.OrderDetails;
import com.colruyt.starter.service.OrderDetailsService;
import com.colruyt.starter.service.OrderService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class OrderDetailsController {
	
	@Autowired
	OrderDetailsService orderDetailsService;
	
	
	@RequestMapping("/orderDetails")
	public List<OrderDetails> getAllStudents()
	{
		return orderDetailsService.getAllOrderDetails();
	}
	
	
	@RequestMapping("/orderDetails/{orderNo}")
	public List<OrderDetails> getOrderByOrderNo(@PathVariable String orderNo)
	{
		return orderDetailsService.getOrderDetailsByOrderNo(orderNo);
	}

}
