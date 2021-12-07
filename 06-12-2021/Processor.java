package com.technoelevate.springpractice.beans;

public class Processor {
	private String name;

	@Override
	public String toString() {
		return "Processor [name=" + name + "]";
	}

	public Processor(String name) {
		super();
		this.name = name;
	}

	
}
