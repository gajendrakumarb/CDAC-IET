import java.util.Scanner;
class Palindrome{  
public static void main(String args[]){  
	int remainder , sum=0 ,temp ;    
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number to check palindrome");
	num = sc.nextInt();
	temp=num;
	while(num>0){
		remainder =num%10;
		sum=(sum*10)+remainder ;
		num=num/10;    
	}
	if(temp==sum)    
   		System.out.println("It is a palindrome number"); 
	else    
		System.out.println("It is not a palindrome number");    
}  
}  