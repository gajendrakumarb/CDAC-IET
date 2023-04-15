import java.lang.Math;
import java.util.Scanner;
class Power{
public static void main(String[] args){
	double num, pow, result;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number whoes power want to calculate");
	num = sc.nextInt();
	System.out.println("Enter power value");
	pow = sc.nextInt();
	System.out.println("Answer = "+Math.pow(num,pow));
	
}
}