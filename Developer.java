package com.sonata.One;

public class Developer extends Employee {

	Developer(int a, String b, double c) {
		super(a, b, c);
	}
	
	public void salCal() {
		double salary=empSal*1.1;
		System.out.println("Total Salary :" + salary);
	}
	
	
	public static void main(String args[]) {
		Developer d=new Developer(20,"RAY", 80000);
		d.display();
		d.salCal();
	}
	
	

}
