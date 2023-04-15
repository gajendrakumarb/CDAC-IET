package com.employee;

import java.util.Scanner;

public class Employee {
	int empId ; //  instance 
	static int count ;
	
	static 
	{	//System.out.println("inside static block");	
		count  = 100; 
		
	}	
	
	double basicSal;
	String firstName , lastName;
	public Employee() {
		
		//count= count+1;
		this(1000,"Jen","Dove");
//		empId= count;
//		basicSal=1000;
//		firstName= "Jen";
//		lastName="Dove";
		
		
	}
	public Employee(String firstName , String lastName) {
		empId= 0001;
		basicSal=2500;
		this.firstName= firstName;
		this.lastName=lastName;
	}
	public Employee( double basicSal,String firstName , String lastName) {
		count= count+1;
		this.empId= count;
		this.basicSal=basicSal;
		this.firstName= firstName;
		this.lastName=lastName;
	}
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID");
		empId = sc.nextInt();
		System.out.println("Enter Employee's First name");
		firstName= sc.next();
		System.out.println("Enter Employee's last name");
		lastName= sc.next();
		System.out.println("Enter Employee's basic Salary");
		basicSal = sc.nextInt();
	}
	public void showData() {
		
		System.out.println("Employee ID :"+empId);
		System.out.println("Employee name : "+firstName+" "+lastName);
		System.out.println("Salary :"+basicSal);
		System.out.println("________________________________________________");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();  // instance 
		e.showData();
		
//		Employee e1 = new Employee();
//		e1.acceptData();
//		e1.showData();
		
		Employee e2 = new Employee("Sam","Bank");
		e2.showData();

		Employee e3 = new Employee( 4666.0,"Aray","Bank");
		e3.showData();
	}

}
