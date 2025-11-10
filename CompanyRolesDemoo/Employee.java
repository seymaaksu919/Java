package main1;

public class Employee {
	
	protected String name;
	
	
	Employee (String name){
		System.out.println("Employee created..");
		this.name = name;
	}
	void work() {
		System.out.println("Employee is working..");
	}
	

}