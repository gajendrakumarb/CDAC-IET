package factorial;

import java.util.Scanner;

public class Factorial {

	public static int factorial(int a) {
		if(a==1||a==0) {
			return  1;
		}else
			return a*factorial(a-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int i = sc.nextInt();
		
		System.out.println("factorial of "+i+" ="+ factorial(i));

	}

}
