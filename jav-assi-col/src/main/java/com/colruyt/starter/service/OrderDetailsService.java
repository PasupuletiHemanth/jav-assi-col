package com.colruyt.starter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.colruyt.starter.model.OrderDetails;

@Service
public class OrderDetailsService {
List<OrderDetails> lstOrderDetails=new ArrayList<>();
	
	public List<OrderDetails> getAllOrderDetails()
	{
		if(lstOrderDetails.isEmpty())
		{
		
			
			for(int i=1;i<13;i++) {
				
			
			for(int j=1;j<=3;j++)
			{
				OrderDetails orderDetails=new OrderDetails();
				orderDetails.setOrderNo(100000+i);
				orderDetails.setArticleId(1212+i+j);
				orderDetails.setQuantity(j+"P");
				orderDetails.setName("Sample Name "+j);
				lstOrderDetails.add(orderDetails);
			}
			}
			return lstOrderDetails;
		}
		else {
			return lstOrderDetails;
		}
		

		

}
	
	public List<OrderDetails> getOrderDetailsByOrderNo(String orderNo)
	{
		return  lstOrderDetails.stream().filter(t->t.getOrderNo()==Integer.parseInt(orderNo)).collect(Collectors.toList());
	}
}
