package com.technoelevate.javaassignment.arrays;
import java.util.Scanner;
public class Owner {
	int money=500000;
	int m;
	int purchased() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product name :");
		String p=sc.next();
		System.out.println("Enter product price :");
		int i=sc.nextInt();
		return m-i;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Owner o1=new Owner();

		System.out.println("Enter the amount of money from Owner for shoping");
		 o1.m=sc.nextInt();
		 int total=o1.purchased();
		 
		 System.out.println("Total purchased money is :"+(o1.m-total));
		 System.out.println();
		 System.out.println("You have rs "+total+" /-to return owner");
		
		
		
		
		
		
	}
}
	