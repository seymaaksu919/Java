package com.zoolife.animals;

public class main {

	public static void main(String[] args) {
		
		Animal [] animal = {
				new Bird("Eagle", 3),
				new Fish("GoldFish", 1),
				new Mammal("Lion",5)
				
		};
		
		for (Animal a : animal) {
			a.move();
			
			if (a instanceof Flyable) {
				((Flyable) a).fly();
			}
			if (a instanceof Swimmable) {
				((Swimmable) a).swim();
			}
			if (a instanceof Runnable) {
				((Runnable) a).run();
			}
			System.out.println("---------------------");
		}
		

	}

}
