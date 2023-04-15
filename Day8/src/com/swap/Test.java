package com.swap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo a1 = new Demo(11);
		Demo a2 = new Demo(22);

		System.out.println("Before  Swap Function");

		a1.showData();  // 11
		a2.showData();  // 22 
		System.out.println("\n\n");

		//SwapService.swap(a , a2);  // by value  copy 

		// a1  - d1    , a2  - d2 


		System.out.println("After Swap Function");

		a1.showData();  // 22
		a2.showData();  // 11


	}

}
