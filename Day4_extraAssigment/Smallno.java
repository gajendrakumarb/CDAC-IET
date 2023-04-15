import java.util.Scanner;
class Smallno
{
public static void main(String[] args)
{
int smaller=0 , larger=0, num;
Scanner s= new Scanner(System.in);
System.out.println("Enter 10 no");
for(int a=0 ; a<10; a++ )
{
num= s.nextInt();
	if(a==0){
		larger=num;
		smaller= larger;
	}
	else{
		if(smaller>num){
			smaller=num;
		}else if(larger<num){
			larger=num;
		}	
	}
}
System.out.println("Smaller = "+smaller); 
System.out.println("Larger = "+larger);
}
}