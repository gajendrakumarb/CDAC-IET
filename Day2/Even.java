import java.util.Scanner;
class Even
{
	int i , j ;
	
	public void acceptdata()
	{ Scanner sc = new Scanner(System.in);
	  System.out.println(" ENTER NUMBER 1st number");
	  i = sc.nextInt();
	  System.out.println(" ENTER NUMBER 2st number");
	  j = sc.nextInt();
 	}

	public void printEven()
	{
	  int small = (i<j)? i:j;
	  int big = (i>j)? i:j;
	  System.out.println("Even numbers are between "+i+" and "+j);
	  for(int i = small; i<=big; i++){
	  	if(i%2==0){
		System.out.print(" "+i+" ");
		}
	  }

	}
	public static void main(String[] args){
		Even e = new Even();
		e.acceptdata();
		e.printEven();
	}




}