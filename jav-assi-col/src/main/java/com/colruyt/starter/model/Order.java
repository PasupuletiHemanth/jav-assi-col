package com.colruyt.starter.model;

public class Order {
	
	private String custName;
	private int orderNo;
	private String handOverPoint;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getHandOverPoint() {
		return handOverPoint;
	}
	public void setHandOverPoint(String handOverPoint) {
		this.handOverPoint = handOverPoint;
	}
}
