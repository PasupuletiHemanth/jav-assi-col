package com.colruyt.starter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.colruyt.starter.model.Order;
import com.colruyt.starter.model.OrderDetails;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Long> {
	
	List<OrderDetails> findByOrderNo(long orderNo);
	List<OrderDetails> findAll();

}
