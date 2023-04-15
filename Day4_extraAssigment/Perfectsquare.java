import java.util.Scanner;
import java.lang.*;
class Perfectsquare
{
public void checkPerfectsquare()
{

int i;
System.out.println("Enter a number:");
Scanner s=new Scanner(System.in);
 i= s.nextInt();
double temp;
temp=Math.sqrt(i);
int ans=(int)(temp);
if(ans==temp){
System.out.println("given number is perfect square");
}
else{
System.out.println("given number is not a perfect square");
}

}
public static void main(String[] args)
{
Perfectsquare p= new Perfectsquare();
p.checkPerfectsquare();
}
}