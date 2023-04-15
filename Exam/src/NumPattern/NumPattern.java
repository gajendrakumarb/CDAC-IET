package NumPattern;

import java.util.Scanner;

public class NumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		for(int i =0; i<n;i++) {
			for(int j = n-i; j<=n;j++) {
				System.out.print(j);
			}
			
			for(int k = n-1; k>=n-i;k--) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
