import java.util.Scanner;
class CheckPrime
{
	int num;
	public void acceptNum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number :");
		num = sc.nextInt();
	}
	public void checkPrime(){
		boolean prime= true;
		for(int i = 2; i<num ; i++)
		{
			if(num%i == 0)
				prime= false;
		}
		if(prime ==false){
		System.out.print("Num : "+num+" is not Prime");
		}
		else{
		System.out.print("Num : "+num+" is Prime");
		}	
	}
	public static void main(String[] args){
		CheckPrime cp = new CheckPrime();
		cp.acceptNum();
		cp.checkPrime();
	}
}