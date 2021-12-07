package com.technoelevate.springpractice.beans;

public class Vehicle {
	private String name;
	private float price;
	private String number;
	private Engine engine;
	private Wheel wheel;
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", price=" + price + ", number=" + number + ", engine=" + engine + ", wheel="
				+ wheel + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	

}
