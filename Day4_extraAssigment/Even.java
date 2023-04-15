class Even
{
public void forLoop(){
	int a;
	System.out.println("With for Loop");
	for(a=0 ; a<=11 ; a+=2 )
		System.out.println("1 to 11 even numbers"+a);
}
public void nestedIfLoop(){
	int a;
	System.out.println("With nestedIf Loop");
	for(a=0 ; a<=11 ; a++ ){
		if(a%2==0)
		System.out.println("1 to 11 even numbers"+a);
	}
}
public void whileLoop(){
	int a=0;
	System.out.println("With While Loop");
	while( a<=11 ){
		System.out.println("1 to 11 even numbers"+a);
		a+=2; 
	}
}
public static void main(String[] args)
{
	Even e = new Even();
	e.forLoop();
	e.nestedIfLoop();
	e.whileLoop();

}
}
