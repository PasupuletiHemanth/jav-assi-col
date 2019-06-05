package com.colruyt.starter.model;

public class Order {
	
	private String custName;
	private String orderNo;
	private String handOverPoint;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getHandOverPoint() {
		return handOverPoint;
	}
	public void setHandOverPoint(String handOverPoint) {
		this.handOverPoint = handOverPoint;
	}

}
