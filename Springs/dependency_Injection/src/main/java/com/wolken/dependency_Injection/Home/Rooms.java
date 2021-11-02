package com.wolken.dependency_Injection.Home;

public class Rooms {
	private float price;
	private float number;

	public Rooms() {
		System.out.println("default constructor");
	}
	public Rooms(float price) {
		
		this.price = price;
	}
   public Rooms(float price,float number) {
		
		this.price = price;
		this.number=number;
	}
	
	public void setprice(float price) {
	this.price = price;
}
public void setNumber(float number) {
	this.number = number;
}
	public float getPrice() {
		return price;
	}
	public void PrintName() {
		System.out.println(price+"\t"+number);
	}
	@Override
	public String toString() {
		return "Rooms [price=" + price + ", number=" + number + "]";
	}
	
	
	
}
