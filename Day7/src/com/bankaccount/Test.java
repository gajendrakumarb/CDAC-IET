package com.bankaccount;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(101 , "a" , 4589.0f);
		
		//showdetails 
		//String data = a1.showData();
		//System.out.println(data );
		
		a1.showData();	
		
		
		Account a[] = new Account [3] ;//array
		//multiple values with same data type 
			//String data = a[0].showData();
			
			
			//a[1].showData();
			//a[2].showData();  // for loop		
		AccountServices.createAccounts(a);
		AccountServices.displayAccounts(a);
		System.out.println(AccountServices.searchData(a,107));
		

	}

}
