package com.account;

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
	
	public void createAccount(Account a[]) {
		Scanner s = new Scanner(System.in);
		for(int i = 0 ; i<a.length ; i++){
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
			a[i] = new Account(accId,pincode,pin,name,balance,iRate);
		}
		
		//
		}
	public void displayAcc(Account a[]) {
		for(int i = 0 ; i<a.length ; i++){
			System.out.println("your account ditals:");
			System.out.println(" Account no.:"+a[i].accId);
			System.out.println(" pincode :"+a[i].pincode);
			System.out.println(" pin :"+a[i].pin);
			System.out.println(" name:"+a[i].name);
			System.out.println(" balance "+a[i].balance);
			System.out.println("____________________________________________");
		}
		
			
	}
	public void deposit(Account a[],int accno) {
		Scanner s=new Scanner(System.in);
		for(int i = 0 ; i<a.length ; i++){
			if(a[i].accId==accno) {
				
				System.out.println("Old balance :"+a[i].balance);
				System.out.println("Enter Deposite Amount.");
				int amount=s.nextInt();
				a[i].balance = a[i].balance+amount;
				System.out.println("New balance :"+a[i].balance);
			}
		}
		
	}
	public void withdrwal(Account a[],int accno) {
		Scanner s=new Scanner(System.in);
		
		for(int i = 0 ; i<a.length ; i++){
			if(a[i].accId==accno) {
				
				System.out.println("Old balance :"+a[i].balance);
				System.out.println("Enter Withdraw Amount.");
				int amount=s.nextInt();
				if(amount<=a[i].balance) {
					a[i].balance = a[i].balance-amount;
				System.out.println("New balance :"+a[i].balance);}
				else
					System.out.println("You cant over draft ammount");
			}
		}
		
	}
	public void balance(Account a[],int accno) {

		for(int i = 0 ; i<a.length ; i++){
			if(a[i].accId==accno) {
				System.out.println(" balance :"+a[i].balance);
			}
		}
		
	}
	public static void changeiRate() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter New Interest rate in integer");
		iRate=  s.nextInt();
	}
	public void calInterest(Account a[],int accno) {

		for(int i = 0 ; i<a.length ; i++){
			if(a[i].accId==accno) {
				double interest = (a[i].balance*iRate)*(1.0/12);
				System.out.println(" Interest for 30 days = "+ interest);
			}
		}
		
		
	}
	public void showMenu() {
		boolean choice = true;
		int accno;
		int ch;
		Account a[]= new Account[5];
		Scanner s=new Scanner(System.in);
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
						createAccount(a);
						break;
					case 2:
						displayAcc(a);
						break;
					case 3:
						
						System.out.println("Enter account no for deposit");
						accno=  s.nextInt();
						deposit(a,accno);
						break;
					case 4:
						
						System.out.println("Enter account no for Withdraw");
						accno=  s.nextInt();
						withdrwal(a,accno);
						break;
					case 5:
						System.out.println("Enter account no to check balance");
						accno=  s.nextInt();
						 balance(a,accno);
						break;
					case 6:
						changeiRate();
						break;
					case 7:
						System.out.println("Enter account no to check Interest Rate");
						accno=  s.nextInt();
						calInterest(a,accno);
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
