package com.employee;

import java.util.Scanner;

public class Employee {
	int empId ; //  instance 
	static int count ;
	
	static 
	{	System.out.println("inside static block");	
		count  = 100; 
		
	}	
	
	float basicSal;
	String firstName , lastName;
	public Employee() {
		count= count+1;
		empId= count;
		basicSal=1000;
		firstName= "Jen";
		lastName="Dove";
	}
	public Employee(String firstName , String lastName) {
		//empId= 0001;
		//basicSal=1000;
		this.firstName= firstName;
		this.lastName=lastName;
	}
	public Employee(float basicSal,String firstName , String lastName) {
		//this.empId= empId;
		this.basicSal=basicSal;
		this.firstName= firstName;
		this.lastName=lastName;
	}
	
	public void showData() {
		
		System.out.println("Employee ID :"+empId);
		System.out.println("Employee name : "+firstName+" "+lastName);
		System.out.println("Salary :"+basicSal);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();  // instance 
		System.out.println(e.empId);
		
		Employee e1 = new Employee();
		System.out.println(e1.empId);
		
		Employee e2 = new Employee();
		System.out.println(e2.empId);

	}

}
