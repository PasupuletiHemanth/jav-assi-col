package com.colruyt.starter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ordersTest")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long orderNo;
	private String custName;
	private String handOverPoint;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}
	public String getHandOverPoint() {
		return handOverPoint;
	}
	public void setHandOverPoint(String handOverPoint) {
		this.handOverPoint = handOverPoint;
	}
}
