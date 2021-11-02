package com.wolken.dependency_Injection.Bus;

public class Passager {
	private String name;
	private float number;

	public Passager() {
		System.out.println("default constructor");
	}
	public Passager(String name) {
		
		this.name = name;
	}
   public Passager(String name,float number) {
		
		this.name = name;
		this.number=number;
	}
	
	public void setName(String name) {
	this.name = name;
}
public void setNumber(float number) {
	this.number = number;
}
	public String getName() {
		return name;
	}
	public void PrintName() {
		System.out.println(name+"\t"+number);
	}
	@Override
	public String toString() {
		return "Passager [name=" + name + ", price=" + number + "]";
	}
	
	
	
	
	
	
	
}

