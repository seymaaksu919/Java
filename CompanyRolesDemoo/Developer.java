package main1;

import main1.Employee;

class Developer extends Employee {

	Developer(String name) {
		super(name);
		System.out.println("Developer created..");
		
	}
	void work () {
		super.work();
		System.out.println("Developer is working..");
		

	}
}
	
