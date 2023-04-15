package com.bankaccount;

import java.util.Scanner;

public class AccountServices {
	public static void createAccounts(Account a[]) {
		System.out.println("Create Array");
		Scanner s = new Scanner(System.in);
		for(int i = 0 ; i<a.length ; i++){
			System.out.println("Enter Account id:");
			int id = s.nextInt();
			System.out.println("Enter Accountholder name:");
			String name = s.next();
			System.out.println("Enter currnet balance:");
			float balance = s.nextFloat();
			a[i] = new Account(id,name,balance);

		}
	}
	public static void displayAccounts(Account a[]) {
		for(int i = 0 ; i<a.length ; i++){
			a[i].showData();
		}
	}
	
	public static int searchData(Account a[], int tempid) {
		for(int i = 0 ; i<a.length ; i++){
			if(a[i].id==tempid)
				return a[i].id;
		}
		return -1;
	}
	public static void updateAccount(Account a[], int tempid, float balance) {
		int i = searchData(a,tempid);
		if(i>-1) {
			a[i].balance=balance;
		}
	}

}
