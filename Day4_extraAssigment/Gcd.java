import java.util.Scanner;
class Gcd
{
public static void main(String[] args){
	int num1, num2, gcd=1;
	Scanner scan= new Scanner(System.in);
	System.out.print("Enter number1: ");
	num1 = scan.nextInt();
	System.out.print("Enter number2: ");
	num2 = scan.nextInt();
	int temp=(num1<num2)?num1:num2	;
	while (temp>0){
		if(num1%temp==0 && num2%temp==0){
			gcd=temp;
			break;
		}
		temp--;
	}
	System.out.println("The Greatest comman divisor is: "+gcd);
}
}

