package com.zoolife.animals;

public class Fish extends Animal implements Swimmable{
	
	
	public Fish(String name ,int age) {
		super(name,age);
	}
	
	
	@Override
	public void move () {
		System.out.println(getName()+"     is swimming !");
	}
	
	@Override
	public void swim() {
		System.out.println(getName() +"   swims in water");
	}
	

}
