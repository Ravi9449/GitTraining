package com.sonata.One;

public class Employee {
	int empId;
	String empName;
	double empSal;
	
	Employee(int a, String b, double c){
		this.empId=a;
		this.empName=b;
		this.empSal=c;
	}
	
	 public void display() {
		System.out.println("The Employee ID : " + empId);
		System.out.println("The Emplyee name : " + empName);
		System.out.println("Salary :" + empSal);
	}
	 public void salCal() {
	 }
	 
	

}
