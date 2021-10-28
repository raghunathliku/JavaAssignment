package com.technoelevate.javaassignment.arrays;

public class Grandson extends Son {
	void play() {
		System.out.println("playing is healthful activity");
	}

	public static void main(String[] args) {
		Grandson grandson= new Grandson();
		grandson.gym();
		grandson.education();
		grandson.work();
		grandson.play();
		
		
	}

}
