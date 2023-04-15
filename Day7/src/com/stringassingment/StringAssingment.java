package com.stringassingment;

import java.util.Scanner;

public class StringAssingment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = s.next();
		System.out.println("HELLO "+name.toUpperCase());
		System.out.println("hello "+name.toLowerCase());
		System.out.println("Does your name is start with A "+name.startsWith("A"));
		System.out.println("Dose your name is end with G "+name.endsWith("G"));
		
		
		

	}

}
