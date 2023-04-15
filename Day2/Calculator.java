import java.util.Scanner;
class Calculator
{
	int i , j ;
	
	public void acceptdata()
	{ Scanner sc = new Scanner(System.in);
	  System.out.println(" ENTER NUMBER 1st number");
	  i = sc.nextInt();
	  System.out.println(" ENTER NUMBER 2st number");
	  j = sc.nextInt();
 	}
	
	public void add()
	{ 
	  System.out.println( "Addition is " +(i+j));
	}
	
	public void sub()
	{ 
	  System.out.println( "substraction  is " +(i-j));
	}

	public void mult()
	{ 
	  System.out.println( "miltiplication is " +(i*j));
	}

	public void div()
	{ 
	  System.out.println( "division is " +(i/j));
	}

      public static void main(String[] str )
	{   
	  boolean choice = true;
	  int ch;
	  Calculator cal = new Calculator();
	  
	 	while (choice){
			Scanner sc = new Scanner(System.in);
			System.out.println( "Enter 1 to Add");
			System.out.println( "Enter 2 to Sub");
			System.out.println( "Enter 3 to Multi");
			System.out.println( "Enter 4 to Divi");
			System.out.println(" ENTER Choice NUMBER");
	 		ch= sc.nextInt();
			switch(ch){
				case 1:cal.acceptdata();
					cal.add();
					break;
				case 2:cal.acceptdata();
					cal.sub();
					break;
				case 3:cal.acceptdata();
					cal.mult();
					break;
				case 4:cal.acceptdata();
					cal.div();
					break;
				default:
					System.out.println(" Exiting from Calculator");
					choice=false;
					break;
			}
		}
	}
}