package com.technoelevate.javaassignment.arrays;
/*
 *if try block is there so there must be either catch block or finally block present 
 *without try catch block can't be written
 *without try finally block can't be written. 
 * so without try no catch and no finally block can't be written here.
 */
public class ExploreSingleTryAndAll {

	public static void main(String[] args) {
		System.out.println("First print statement");
		
		
		
		int a=10;
		int b=0;
		try {
		System.out.println(a/b);
		
		
		}
		
		catch(ArithmeticException e){
		System.out.println("using catch block it is solved");	
		}
		
		finally {
			System.out.println("finally block is executed");
		}
		
		System.out.println("last print statement");
		

	}

}
