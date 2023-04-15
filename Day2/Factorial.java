import java.util.Scanner;
class Factorial
{
	int num;
	public int acceptNum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number :");
		num = sc.nextInt();
		return num;
	}
	
	public int calfactorial(int i){
		if (i==1||i==0)
	 		return 1;
		else{
		int factorial=i*calfactorial(i-1);
		return factorial;
		}
	}
	public static void main(String[] str)
	{
	Factorial f =new Factorial();
	
	System.out.print("factorial :"+f.calfactorial(f.acceptNum()));
	
	}	
}