package com.technoelevate.springpractice.beans;

public class Screen {
	private String screenSize;

	

	public Screen(String screenSize) {
		super();
		this.screenSize = screenSize;
	}



	@Override
	public String toString() {
		return "Screen [screenSize=" + screenSize + "]";
	}

}
