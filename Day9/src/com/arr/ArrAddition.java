package com.arr;

import java.util.Scanner;

public class ArrAddition {

	public static void main(String[] args) {
		
		int arr1[] [] = new int[3][3];
		System.out.println("Enter 1st matrix");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.println("Enter Element at["+ i+ "] ["+ j+ "]");
				Scanner sc=new Scanner(System.in);
				arr1[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("Enter 2nd matrix");
		int arr2[] [] = new int[3][3];
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.println("Enter Element at["+ i+ "] ["+ j+ "]");
				Scanner sc=new Scanner(System.in);
				arr2[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println(" 1st matrix");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(" "+arr1[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println(" 2nd matrix");
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(" "+arr2[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("Addition of Matrix =");
		int arr3[] [] = new int [3][3];
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(" "+arr3[i][j]+" ");
				
			}
			System.out.println();
		}
      
	}

}
