package com.evergent.corejava.casestudy.ticketsystem;

public class TicketBean {
	int empId;
	String name;
	double price;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ticket Id:"+empId+"| Name:"+name+"| Price:"+price;
	}
   
	
	

}
