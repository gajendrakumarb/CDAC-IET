import java.util.Scanner;
class FourNumDis
{
	
	public static void main(String[] args){
		int num=0,sum=0,n,r;
		System.out.println("Enter four digit no :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		String nums = ""+num;
		for(int i =0; i<nums.length();i++){
			char c = nums.charAt(i);
			if(c=='0')
				System.out.print(" zero ");
			else if(c=='1')
				System.out.print(" one ");
			else if(c=='2')
				System.out.print(" two ");
			else if(c=='3')
				System.out.print(" three ");
			else if(c=='4')
				System.out.print(" four ");
			else if(c=='5')
				System.out.print(" five ");
			else if(c=='6')
				System.out.print(" six ");
			else if(c=='7')
				System.out.print(" seven ");
			else if(c=='8')
				System.out.print(" eight ");
			else
				System.out.print(" nine ");
		}
	}
}