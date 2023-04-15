package com.car;

public class Car {
	static String origin;
	String name;
	static{
		origin = "Germany";
		System.out.println("We are in static block");
		System.out.println();
	}
	{
		name="Wolkswagen";
		System.out.println("We are in instance block");
		System.out.println();
	}
	
	public static void run() {
		System.out.println("Static Variable values "+origin);
		System.out.println("We are in Static Method- Run");
		System.out.println();
	}
	public void stop() {
		System.out.println("Static Variable values "+origin);
		System.out.println("Instance Variable values "+name);
		System.out.println("We are in Instance method - Stop");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		c.run();
		c.stop();
		Car.run();
		Car.origin = "Japan";
		c.run();
		c.stop();
		Car.run();
		Car c2 = new Car();
		c2.run();
		c2.stop();
		Car.run();

	}

}
