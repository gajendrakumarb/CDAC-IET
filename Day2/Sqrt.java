import java.lang.Math;
import java.util.Scanner;
class Sqrt{
public static void main(String[] args){
	double num, pow, result;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number whoes sqare root want to calculate");
	num = sc.nextInt();
	//System.out.println("Enter power value");
	pow = 0.5;
	System.out.println("Answer = "+Math.pow(num,pow));
	
}
}