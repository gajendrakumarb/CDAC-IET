package com.bank;

import java.util.Scanner;

public class Account {

	int accId , pincode , pin ;
	String name ;
	float balance;
	static int iRate;
	
	public Account(int accId , int pincode , int pin, String name , float balance ,int iRate) {
	 this.accId= accId;
	 this.pincode= pincode;
	 this.pin= pin;
	 this.name= name;
	 this.balance= balance;
	 this.iRate= iRate;
	 
	}
	public Account() {
		this(10111, 410506, 4658, "pream", 50000, 8);
	}
	
	public void createAccount() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Account no.");
		accId=	s.nextInt();
		System.out.println("Enter pincode");
		pincode=s.nextInt();
		System.out.println("Enter pin");
		pin=	s.nextInt();
		System.out.println("Enter name");
		name=   s.next();
		System.out.println("Enter balance");
		balance=s.nextFloat();
		//iRate=  s.nextInt();
		}
	public void displayAcc() {
		System.out.println("your account ditals:");
		System.out.println(" Account no.:"+accId);
		System.out.println(" pincode :"+pincode);
		System.out.println(" pin :"+pin);
		System.out.println(" name:"+name);
		System.out.println(" balance "+balance);
			
	}
	public void deposit() {
		Scanner s=new Scanner(System.in);
		System.out.println("Old balance :"+balance);
		System.out.println("Enter Deposite Amount.");
		int amount=s.nextInt();
		balance = balance+amount;
		System.out.println("New balance :"+balance);
	}
	public void withdrwal() {
		Scanner s=new Scanner(System.in);
		System.out.println("Old balance :"+balance);
		System.out.println("Enter Withdraw Amount.");
		int amount=s.nextInt();
		if(amount<=balance) {
		balance = balance-amount;
		System.out.println("New balance :"+balance);}
		else
			System.out.println("You cant over draft ammount");
	}
	public void balance() {
		System.out.println(" balance :"+balance);
	}
	public static void changeiRate() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter New Interest rate in integer");
		iRate=  s.nextInt();
	}
	public void calInterest() {
		double interest = (balance*iRate)*(1.0/12);
		System.out.println(" Interest for 30 days = "+ interest);
		
	}
	public void showMenu() {
		boolean choice = true;
		int ch;
		 	while (choice){
				Scanner sc = new Scanner(System.in);
				System.out.println("_________________________________________");
				System.out.println( "Enter 1 to Create Account ");
				System.out.println( "Enter 2 to Display Information of Account");
				System.out.println( "Enter 3 to Deposit");
				System.out.println( "Enter 4 to Withdrwal");
				System.out.println( "Enter 5 to check Balance ");
				System.out.println( "Enter 6 to change iRate");
				System.out.println( "Enter 7 to calculate Intrest for 30 days");
				System.out.println( "Enter 8 to Exit");
				System.out.println(" ENTER Choice NUMBER");
		 		ch= sc.nextInt();
				switch(ch){
					case 1:
						createAccount();
						break;
					case 2:
						displayAcc();
						break;
					case 3:
						deposit();
						break;
					case 4:
						withdrwal();
						break;
					case 5:
						 balance();
						break;
					case 6:
						changeiRate();
						break;
					case 7:
						calInterest();
						break;
					case 8:
						System.out.println(" Exiting from Account");
						choice=false;
						break;
					default:
						System.out.println(" Exiting from Account");
						choice=false;
						break;
				}
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.showMenu();
		

	}

}
