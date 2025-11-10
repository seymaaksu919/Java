package com.zoolife.animals;

public class Bird  extends Animal implements Flyable ,Runnable{

	public Bird(String name, int age) {
		super(name, age);
		
	}

	@Override
	public void run() {
		System.out.println(getName()+ "   runs on the ground");
		
		
	}
	//Uçma yeteneğini gösterir.
	@Override
	public void fly() {
		System.out.println(getName()+"   flaps its wings and flies.");
		
		
	}

	@Override
	public void move() {
		
		System.out.println(getName() +"  is flying!");
		
	
		
}

}
