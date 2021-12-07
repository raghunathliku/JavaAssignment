package com.technoelevate.springpractice.beans;

public class Laptop {
	private String name;
	private Ram ram;
	private MotherBoard motherBoard;
	private Processor processor;
	private Screen screen;
	public Laptop(String name, Ram ram, MotherBoard motherBoard, Processor processor, Screen screen) {
		super();
		this.name = name;
		this.ram = ram;
		this.motherBoard = motherBoard;
		this.processor = processor;
		this.screen = screen;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", ram=" + ram + ", motherBoard=\n" + motherBoard + ", processor=\n" + processor
				+ ", screen=" + screen + "]";
	}
	

}
