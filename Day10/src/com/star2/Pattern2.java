package com.star2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how long you want the patteren");
		int n = sc.nextInt();
		for(int i=0; i<n ;i++) {
			for(int j = i+1;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
