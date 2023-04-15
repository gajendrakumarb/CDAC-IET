package com.star1;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how long you want the patteren");
		int n = sc.nextInt();
		for(int i=0; i<n ;i++) {
			for(int j = n-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
