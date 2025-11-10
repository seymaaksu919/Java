package com.zoolife.animals;

public abstract class Animal {
	
	
	private String name;
	private int age;
	

	public Animal (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName () {
		return name;
	}
	
	public int getAge(int age) {
		return age;
	}
	
	//Animal kendisi doğrudan bir hayvan değil bir şablon.
	public abstract void move();
	
}
