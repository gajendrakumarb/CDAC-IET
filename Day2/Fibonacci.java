import java.util.Scanner;
class Fibonacci
{
	int n;
	public void acceptNum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number :");
		n = sc.nextInt();
	}
	public void printFibonacci(){
		int sum=2;
		int previous = 1;
		int secondprevious=0;
		for(int i = 0; i<n ; i++)
		{
			if(i == 0 || i==1)
				System.out.print(" "+1+" ");
			else if(i == 2)
				System.out.print(" "+2+" ");
			else
			{
				secondprevious=sum;
				sum= sum + previous;
				System.out.print(" "+sum+" ");
				previous = secondprevious;
			}
		}
			
	}
	public static void main(String[] args){
		Fibonacci f= new Fibonacci();
		f.acceptNum();
		f.printFibonacci();
	}
}