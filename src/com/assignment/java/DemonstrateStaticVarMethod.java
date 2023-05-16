package com.assignment.java;

public class DemonstrateStaticVarMethod {
	static int ak=0;
	
	static void Display() {
		System.out.println("Displaying Static method");
	}
	static{
		System.out.println("Displaying static block");
	}
	{
		System.out.println("displaying block");
	}

	public static void main(String[] args) {
		

		System.out.println("static variable :" +ak);
		Display(); 
		new DemonstrateStaticVarMethod();
	}

}
