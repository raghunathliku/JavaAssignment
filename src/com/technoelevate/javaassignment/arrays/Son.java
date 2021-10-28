package com.technoelevate.javaassignment.arrays;

public class Son implements Father,Mother{
	void gym() {
		System.out.println("exercise keeps you healthy forever");
	}

	public static void main(String[] args) {
		Son son=new Son();
		son.gym();
		son.education();
		son.work();
		

	}

	@Override
	public void education() {
		
		System.out.println("education is needed for the growth of life");
	}

	@Override
	public void work() {
		System.out.println("work hard to become sucessful");
		
		
	}

}
