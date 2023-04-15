import java.util.Scanner;
class Sum
{
	public void forLoop(){
		int i,sum=0, n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of N");
		n=sc.nextInt();
		for(i=0 ;i<=n ; i++){
			sum= sum +i;
		}
		System.out.println("Sum of first N digits = "+ sum);
	}
	public void whileLoop(){
		int i=0,sum=0, n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of N");
		n=sc.nextInt();
		while(i<=n){
			sum= sum +i;
			i++;
		}
		System.out.println("Sum of first N digits = "+ sum);
	}
	public void function(){
		int i,sum=0, n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of N");
		n=sc.nextInt();
		sum= (n*(n+1))/2;
		System.out.println("Sum of first N digits = "+ sum);
	}
public static void main(String[] args)
{
	Sum sum = new Sum();
	sum.forLoop();
	sum.whileLoop();
	sum.function();
}
}
