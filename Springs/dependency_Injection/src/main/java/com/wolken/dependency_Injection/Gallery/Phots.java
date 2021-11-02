package com.wolken.dependency_Injection.Gallery;

public class Phots {
	private String name;
	private float numberofphoto;

	public Phots() {
		System.out.println("default constructor");
	}
	public Phots(String name) {
		
		this.name = name;
	}
   public Phots(String name,float numberofphoto) {
		
		this.name = name;
		this.numberofphoto=numberofphoto;
	}
	
	public void setName(String name) {
	this.name = name;
   }
   public void setNumberofphoto(float numberofphoto) {
	this.numberofphoto = numberofphoto;
    }
	public String getName() {
		return name;
	}
	public void PrintName() {
		System.out.println(name+"\t"+numberofphoto);
	}
	@Override
	public String toString() {
		return "Passager [name=" + name + ", price=" + numberofphoto + "]";
	}
	
	
	
	
	
	
	
}

