package main1;

import main1.Employee;

class Manager extends Employee {

    Manager(String name) {
        super(name);
        System.out.println("Manager created..");
    }

   
    void work() {
        super.work();
        System.out.println("Manager is working..");
    }
}