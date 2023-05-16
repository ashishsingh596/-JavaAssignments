package com.assignment.java;

public class CmdLineInput {

	public static void main(String[] args) {
		int sum=0;
		int count=0;
		for(int i=0; i<args.length;i++) {
		try {
		sum+=Integer.parseInt(args[i]) ;
		}
		catch(NumberFormatException e) {
			System.out.println("Your invalid integer entered is :"+e.toString());
			count+=1;
		}
		
		}
		System.out.println("Sum of all command line arguments : "+sum);
		System.out.println("Invalid integers are : "+count);
	}

}
