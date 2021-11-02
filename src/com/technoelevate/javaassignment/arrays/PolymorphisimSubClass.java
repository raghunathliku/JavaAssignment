package com.technoelevate.javaassignment.arrays;


public class PolymorphisimSubClass extends Polymorphisim {
	@Override
	void sub() {
		System.out.println("this is from  overrided child class method-1");
		
	}
	@Override
	void sub(int a) {
		System.out.println("this is from  overrided child method-2");
		
	}

	public static void main(String[] args) {
		PolymorphisimSubClass class1=new PolymorphisimSubClass();
		class1.sub();
		class1.sub(10);
		
	

	}

}

