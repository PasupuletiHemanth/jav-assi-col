package com.colruyt.starter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colruyt.starter.model.OrderDetails;
import com.colruyt.starter.repository.OrderDetailsRepository;

@Service
public class OrderDetailsService {
	
	@Autowired
	private OrderDetailsRepository orderDetailsRepository;
	
List<OrderDetails> lstOrderDetails=new ArrayList<>();
	
	public List<OrderDetails> getAllOrderDetails()
	{
		
		/*if(lstOrderDetails.isEmpty())
		{
		
			
			for(int i=1;i<13;i++) {
				
			
			for(int j=1;j<=3;j++)
			{
				OrderDetails orderDetails=new OrderDetails();
				//orderDetails.setOrderNo(100000+i);
				orderDetails.setOrderNo(i);
				orderDetails.setArticleId(1212+i+j);
				orderDetails.setQuantity(j+"P");
				orderDetails.setName("Sample Name "+j);
				lstOrderDetails.add(orderDetails);
				orderDetailsRepository.save(orderDetails);
			}
			}
			System.out.println(orderDetailsRepository.findByOrderNo(1));
			return lstOrderDetails;
		}
		else {
			return lstOrderDetails;
		}*/
		return orderDetailsRepository.findAll();
}
	
	public List<OrderDetails> getOrderDetailsByOrderNo(String orderNo)
	{
		//return  lstOrderDetails.stream().filter(t->t.getOrderNo()==Integer.parseInt(orderNo)).collect(Collectors.toList());
		return orderDetailsRepository.findByOrderNo(Long.parseLong(orderNo));
	}
}
