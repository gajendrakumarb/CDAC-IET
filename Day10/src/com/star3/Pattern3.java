package com.star3;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how long you want the patteren");
		int n = sc.nextInt();
		for(int i=0; i<n ;i++) {
			for(int j = n-i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int j = i+1;j>0;j--) {
				if((i+1)%2!=0) {
				if(j%2!=0)
				System.out.print("*");
				else
				System.out.print(" ");}
				else {
					if(j%2==0)
						System.out.print("*");
						else
						System.out.print(" ");
				}
			}
			for(int j = i;j>0;j--) {
				if((i)%2!=0) {
				if(j%2!=0)
				System.out.print("*");
				else
				System.out.print(" ");}
				else {
					if(j%2==0)
						System.out.print(" *");
						else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
