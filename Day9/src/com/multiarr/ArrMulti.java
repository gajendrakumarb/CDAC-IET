package com.multiarr;

import java.util.Scanner;

public class ArrMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] [] = new int[2][2];
		System.out.println("Enter 1st matrix");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.println("Enter Element at["+ i+ "] ["+ j+ "]");
				Scanner sc=new Scanner(System.in);
				arr1[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("Enter 2nd matrix");
		int arr2[] [] = new int[2][2];
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.println("Enter Element at["+ i+ "] ["+ j+ "]");
				Scanner sc=new Scanner(System.in);
				arr2[i][j]=sc.nextInt();
				
			}
			
		}System.out.println("Multiplication of Mtrix");
		int arr3[] [] = new int [2][2];
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr3[i][j]=0;
						
				for(int k=0; k<arr2[i].length; k++) {
				arr3[i][j]+=arr1[i][k]*arr2[k][j];
				}
				
				
				System.out.print(" "+arr3[i][j]);
				
			}
			System.out.println();
		}

	}

}
