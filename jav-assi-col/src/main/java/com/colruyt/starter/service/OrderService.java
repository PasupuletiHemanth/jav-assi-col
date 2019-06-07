package com.colruyt.starter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colruyt.starter.model.Order;
import com.colruyt.starter.repository.OrderRepository;

@Service
public class OrderService {
	
	 @Autowired
	 private OrderRepository orderRepository;
	
	List<Order> lstOrder=new ArrayList<>();
	
	public List<Order> getAllOrders()
	{
		/*System.out.println(orderRepository.findByOrderNo(1));
		if(lstOrder.isEmpty())
		{
			for(int i=1;i<13;i++)
			{
				Order order=new Order();
				order.setCustName("Sample Customer Name"+i);
				order.setOrderNo(100000+i);
				order.setHandOverPoint("Sample HandOver Point"+i);
				lstOrder.add(order);
				orderRepository.save(order);
			}
			return lstOrder;
		}
		else {
			return lstOrder;
		}*/
		
		return orderRepository.findAll();
	}

	public Order getOrderByOrderNo(String orderNo) {
		// TODO Auto-generated method stub
		return lstOrder.stream().filter(t->t.getOrderNo()==Integer.parseInt(orderNo)).findFirst().get();
	}

}
