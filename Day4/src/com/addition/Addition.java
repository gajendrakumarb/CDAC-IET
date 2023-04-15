package com.addition;

public class Addition {
	
	 
	public void add(int...i) {
		int sum = 0;  // local  Arrays  length()
		for(int s = 0 ; s < i.length ; s ++ ) {
			sum = sum + i[s];
			}	
	System.out.println("Addition of " + i.length + " numbers " + sum);
	} 
	public void nameString(String...s) {
		String nameStr="";
		for(String i : s) {
			nameStr = nameStr.toString()+" "+i;
		}
		System.out.println("All joined names " +nameStr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a = new Addition();
		a.add();
		a.add(1,2);
		a.add(1,2,3,4,5);
		a.add(1,2,3,4,5,6,7);
		a.nameString("Ram","Shayam","Joe","Kumar");

	}

}
