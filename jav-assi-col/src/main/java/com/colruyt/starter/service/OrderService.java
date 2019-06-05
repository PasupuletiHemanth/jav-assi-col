package com.colruyt.starter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.colruyt.starter.model.Order;

@Service
public class OrderService {
	
	List<Order> lstOrder=new ArrayList<>();
	
	public List<Order> getAllOrders()
	{
		if(lstOrder.isEmpty())
		{
			for(int i=0;i<12;i++)
			{
				Order order=new Order();
				order.setCustName("Sample Customer Name"+i);
				order.setOrderNo("Sample orderNo "+i);
				order.setHandOverPoint("Sample HandOver Point"+i);
				lstOrder.add(order);
			}
			return lstOrder;
		}
		else {
			return lstOrder;
		}
		
	}

	public Order getOrderByOrderNo(String orderNo) {
		// TODO Auto-generated method stub
		return lstOrder.stream().filter(t->t.getOrderNo()==orderNo).findFirst().get();
	}

}
