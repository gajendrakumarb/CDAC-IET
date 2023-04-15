import java.util.Scanner;

class AlternatePrime{
public static void main(String[] args){
	int count=0;
	Scanner s = new Scanner(System.in);
	
	for(int num=2; num<100;num++){
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
		if(count%2==0){
			System.out.println(count+"th prime is "+ num);
			}
		}
	}	
}
}