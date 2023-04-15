import java.util.Scanner;
class FourNumDisplay
{
	
	public static void main(String[] args){
		int num=0,sum=0,n,r;
		System.out.println("Enter four digit no :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		n=num;
		while(n>0){
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		n=sum;
		while(n>0){
			r=n%10;
			if(r==0)
				System.out.print(" zero ");
			else if(r==1)
				System.out.print(" one ");
			else if(r==2)
				System.out.print(" two ");
			else if(r==3)
				System.out.print(" three ");
			else if(r==4)
				System.out.print(" four ");
			else if(r==5)
				System.out.print(" five ");
			else if(r==6)
				System.out.print(" six ");
			else if(r==7)
				System.out.print(" seven ");
			else if(r==8)
				System.out.print(" eight ");
			else
				System.out.print(" nine ");
			n=n/10;
		}
	}
}