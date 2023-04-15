import java.util.Scanner;

class NthPrime{
public static void main(String[] args){
	int count=0;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter nth number");
	int n = s.nextInt();
	for(int num=2; num<10000;num++){
		boolean prime= true;
		for(int i = 2; i<num ; i++)
		{
			if(num%i == 0)
				prime= false;
		}
		if(prime ==false){
		//System.out.print("Num : "+num+" is not Prime");
		}
		else{
		//System.out.print("Num : "+num+" is Prime");
		count++;
		if(count==n){
			System.out.println(n+"th prime is "+ num);
			}
		}
	}	
}
}