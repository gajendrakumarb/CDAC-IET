package com.employee;

import java.util.Scanner;

public class Employee {
	int empId;
	float basicSal;
	String firstName , lastName;
	public Employee() {
		empId= 0001;
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
	public Employee(int empId,	float basicSal,String firstName , String lastName) {
		this.empId= empId;
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
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.showData();
		//e.acceptData();
		//e.showData();
		Employee e2 = new Employee("Puma","Simance");
		e2.acceptData();
		e2.showData();

	}

}
