package com.bankaccount;

public class Account {
	int id;String name; float balance;
	
	public Account() {
		
	}

	public Account(int id, String name, float balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public void showData() {
		System.out.println("Account ID : "+id+" Name: " +name+" Balance :"+balance);
	}

}
