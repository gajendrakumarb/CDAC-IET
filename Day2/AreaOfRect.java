import java.util.Scanner;
class AreaOfRect{
public static void main(String[] args){
	int len, wid;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Length of Rectangle");
	len= sc.nextInt();
	System.out.println("Enter width of Rectangle");
	wid= sc.nextInt();
	System.out.println("Area of Rectangle = "+(len*wid));
}
}