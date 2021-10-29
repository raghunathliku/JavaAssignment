package com.technoelevate.javaassignment.arrays;
import java.util.Scanner;
public class SharingPhNo {
    
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Hello ! can you share your girlfriends phno with me");
	System.out.println();
	System.out.println("eneter the phone Number: ");
	System.out.println();
	String ph=sc.next();
	System.out.println("sorry ! the number u have entered is invalid");
	System.out.println();
	System.out.println("please share your contact details");
	System.out.println();
	System.out.println("My all contacts numbers are shown below");
	System.out.println();
	long a[]=new long[7];
    a[0]=6894525222l;
    a[1]=7892325222l;
    a[2]=9876325222l;
    a[3]=7894104222l;
    a[4]=9874025222l;
    a[5]=6874025222l;
    a[6]=7774025222l;
    
    for(int i=0;i<a.length;i++) {
    	System.out.println(a[i]);
    	System.out.println();
    }
	
	

	}

}
