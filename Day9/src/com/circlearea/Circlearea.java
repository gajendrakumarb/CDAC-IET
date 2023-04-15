package com.circlearea;

import java.util.Scanner;

public class Circlearea {
	
	 int r;
	final double Pi= 3.14;

	public static void main(String[] args) {
	
		System.out.println("Enter redius");
		Scanner sc=new Scanner(System.in);
		Circlearea c=new Circlearea();
		c.r= sc.nextInt();
		System.out.println("Area of Circle is : "+ c.Pi*c.r*c.r);	`
		

	}

}
