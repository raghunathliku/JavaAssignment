package com.technoelevate.javaassignment.arrays;
import java.util.Scanner;
public class SwitchCasePosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name gvien below: ");
		System.out.println("Dhananjay,Venketesh,sidhu,Mirza,Das,pransu");
		String s=sc.next();
		switch(s) {
		case "Dhananjay":
			System.out.println("CR");
			break;
		case "Venketesh":
			System.out.println("Project Mgr.");
			break;
		case "sidhu":
			System.out.println("Sleep");
			break;
		case "Mirza":
			System.out.println("Silent");
			break;
		case "Das":
			System.out.println("Dedicated");
			break;
		case "pransu":
			System.out.println("complecated");
			break;
		default :System.out.println("invalid name.");
		}
				
		
	}

}
