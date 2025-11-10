package com.zoolife.animals;

public class Mammal  extends Animal implements Runnable{

	
	public Mammal (String name , int age) {
		super(name,age);
	}
	
	
	@Override
	public void move() {
		System.out.println(getName() +"    iS running!");
		
	}
	
	
	@Override
	public void run() {
		System.out.println(getName() +"    runs on land");
	}


}
