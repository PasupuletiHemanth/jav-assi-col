package com.colruyt.starter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.colruyt.starter.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
	List<Order> findByOrderNo(long orderNo);
	List<Order> findAll();
}
