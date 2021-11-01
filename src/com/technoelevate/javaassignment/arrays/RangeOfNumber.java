package com.technoelevate.javaassignment.arrays;


	/*12.Create a for statement using a range of numbers from 1 to 1000 inclusive
	Sum all the numbers that can be divided with both 3 and 5.
	for those numbers that met the above conditions, print out the number
	break out of the loop once you find 5 numbers that met the above condition
	After breaking out of the loop print the sum of the numbers that met the above conditions.*/
	public class RangeOfNumber {
	public static void main(String[] args) {
		int sum=0;	
		int count=0;
		for(int i=1;i<=1000;i++) {

		if(i%3==0 && i%5==0) {
			count++;
			System.out.println("First digit is "+i);
		}
		sum=sum+i;
		

		
		if(count==5) {
			System.out.println("sum of first five digit is "+sum);
			break;
		}
	}
		  
		  
	}		 
		
	}

		  