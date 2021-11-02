package com.wolken.dependency_Injection.Car;

public class Engine {
	private String name;
	private float price;

	public Engine() {
		System.out.println("default constructor");
	}
	public Engine(String name) {
		
		this.name = name;
	}
   public Engine(String name,float price) {
		
		this.name = name;
		this.price=price;
	}
	
	public void setName(String name) {
	this.name = name;
}
public void setPrice(float price) {
	this.price = price;
}
	public String getName() {
		return name;
	}
	public void PrintName() {
		System.out.println(name+"\t"+price);
	}
	@Override
	public String toString() {
		return "Engine [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
}
