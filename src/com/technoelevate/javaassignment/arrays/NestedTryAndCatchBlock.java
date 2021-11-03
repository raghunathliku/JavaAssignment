package com.technoelevate.javaassignment.arrays;

public class NestedTryAndCatchBlock {

	public static void main(String[] args) {
		System.out.println("First print statement");
		
		try {
			try {
				int a[]=new int[5];
				System.out.println(a[6]);
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("this is from inner try block so chk the arrray size properly");
			}
			System.out.println(10/0);
			
		}
		
		
		
		catch(ArithmeticException e) {
			System.out.println("please check the outer try block logic");
			
		}
		finally {
			System.out.println("This is finally block");
		}
		
		
		
		
		System.out.println("This is last print statement");

	}

}
