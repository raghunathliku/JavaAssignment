package com.technoelevate.springpractice.beans;

public class Engine {
	private int cylinder;
	private int hp;
	@Override
	public String toString() {
		return "Engine [cylinder=" + cylinder + ", hp=" + hp + "]";
	}
	public int getCylinder() {
		return cylinder;
	}
	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

}
