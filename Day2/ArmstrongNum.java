import java.lang.Math;
import java.util.Scanner;
class ArmstrongNum{  
public static void main(String args[]){  
	int remainder , sum=0 ,temp ;    
	int num;
	int count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number to check ArmstrongNum");
	num = sc.nextInt();
	temp=num;
	while(num>0){
		remainder =num%10;
		num=num/10;
		++count;     
	}
	num = temp;
	while(num>0){
		remainder =num%10;
		sum=sum+(int) Math.pow(remainder,count) ;
		num=num/10;
	}
	if(sum==temp)
	   	System.out.println("It is a Armstrong number"); 
	else    
		System.out.println("It is not a Armstrong number"); 
}  
}  