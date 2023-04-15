import java.util.Scanner;
class Swap{
public static void main(String[] args){
	int num1, num2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st Number");
	num1= sc.nextInt();
	System.out.println("Enter 2nd Number");
	num2= sc.nextInt();
	int temp;
	temp=num1;
	num1 = num2;
	num2 = temp;
	//num1 = num1+num2;
	//num2 = num1-num2;
	//num1 = num1-num2;
	System.out.println("Numbers after Swap Num1= "+num1+" Num2="+num2);
}
}