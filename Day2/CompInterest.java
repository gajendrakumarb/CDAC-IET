import java.lang.Math;
import java.util.Scanner;
class CompInterest{
public static void main(String[] args){
	double principle, rate, time, compinterest;
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a Principle number : ");
	principle = sc.nextInt();
	System.out.print("Enter Interest rate : ");
	rate = sc.nextInt();
	System.out.print("Enter a Time period in years : ");
	time = sc.nextInt();
	compinterest = principle *(Math.pow((1 + rate / 100), time));
	System.out.println("The Compound Interest is : " + compinterest);
}
}