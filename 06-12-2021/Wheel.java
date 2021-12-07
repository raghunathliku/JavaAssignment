package com.technoelevate.springpractice.beans;

public class Wheel {
	private String name;
	private float diameter;
	@Override
	public String toString() {
		return "Wheel [name=" + name + ", diameter=" + diameter + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDiameter() {
		return diameter;
	}
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

}
