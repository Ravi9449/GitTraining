package com.sonata.One;

public class Manager extends Employee {

	Manager(int a, String b, double c) {
		super(a, b, c);
	}
	
	public void salCal() {
		double salary=empSal*1.2;
		System.out.println("Total Salary :" + salary);
	}
	
	public static void main(String args[]) {
		Manager m=new Manager(10,"JOY", 100000);
		m.display();
		m.salCal();
	}
	

}
