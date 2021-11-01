package com.technoelevate.javaassignment.arrays;


import java.util.Arrays;  
import java.util.Scanner;

public class ArrayStringSorting {
	

	/*4. Expected Output: 
		   Original string array : [Java, Python, PHP, C#, C Programming, C++]                                           
		   Sorted string array : [C Programming, C#, C++, Java, PHP, Python] 
	*/
	  
	   public static void main(String args[])   
	   {  


	      String str[]= {"Java","Phthon","PHP","C#","C Programming","C++"}; 


	      Arrays.sort(str); 

	      System.out.println(Arrays.toString(str)); 
	   }  

}
