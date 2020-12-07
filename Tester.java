package com.sonata.One;

public class Tester extends Employee {

	Tester(int a, String b, double c) {
		super(a, b, c);
	}
	
	public void salCal() {
		double salary=empSal*1.05;
		System.out.println("Total Salary :" + salary);
	}
	
	
	public static void main(String args[]) {
		Tester t=new Tester(30,"JASON", 50000);
		t.display();
		t.salCal();
	}
	

}
