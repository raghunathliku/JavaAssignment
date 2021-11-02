package com.technoelevate.javaassignment.arrays;

public class Polymorphisim {
	

	
		static void display() {
			System.out.println("this is display () method");
		}
		static void display(int a) {
			System.out.println("this is display (int a) method");
		}
		static void display(String a) {
			System.out.println("this is display (String a) method");
		}
		void sub() {
			System.out.println("this is from parent class method-1");
			
		}
		void sub(int a) {
			System.out.println("this is from parent class method-2");
			
		}
		

		public static void main(String[] args) {
			display();
			display(10);
			display("Liku");
			



		}

	


}
