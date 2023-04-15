package com.student;

import java.util.Scanner;

public class Student {
	String name;
	int m1, m2, m3;
	public Student() {
		this("Dummy",35,35,35);
	}
	public Student(String name, int...i) {
		this.name= name;
		this.m1=i[0];
		this.m2=i[1];
		this.m3=i[2];
	}
	
	public void accessData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name");
		name = sc.next();
		System.out.println("Enter Marks for 1st sub");
		m1 = sc.nextInt();
		System.out.println("Enter Marks for 2nd sub");
		m2 = sc.nextInt();
		System.out.println("Enter Marks for 3rd sub");
		m3 = sc.nextInt();
	}
	public void calPercentage() {
		double percentage =  (m1+m2+m3)/3.0;
		System.out.println("Percentage = "+percentage+" % " );
		if(percentage>=75.0) {
			System.out.println("Grade = A");
		}else if(percentage<75.0 && percentage>=50) {
			System.out.println("Grade = B");
		}else if(percentage<50.0 && percentage>=35) {
			System.out.println("Grade = C");
		}else {
			System.out.println("Grade = F");
		}
	}
	public void showData() {
		System.out.println("Name = "+name);
		System.out.println("Marks for sub1 = "+m1);
		System.out.println("Marks for sub2 = "+m2);
		System.out.println("Marks for sub3 = "+m3);
		calPercentage();
		System.out.println("_____________________________________________");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		//s.accessData();
		s.showData();
		Student s1= new Student("Shayma",64,45,78);
		//s1.accessData();
		s1.showData();
	}

}
