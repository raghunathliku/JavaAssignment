package com.technoelevate.springpractice.beans;

public class MotherBoard {
	private String usbPort;
	private String videoConnector;	
	public MotherBoard(String usbPort, String videoConnector) {
		super();
		this.usbPort = usbPort;
		this.videoConnector = videoConnector;
	}

	@Override
	public String toString() {
		return "MotherBoard [usbPort=" + usbPort + ", videoConnector=" + videoConnector + "]";
	}

}
