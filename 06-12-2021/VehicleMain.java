package com.technoelevate.springpractice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technoelevate.springpractice.beans.Vehicle;

public class VehicleMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("vehiclep.xml");
		Vehicle vehicle=(Vehicle) context.getBean("veh");
		System.out.println(vehicle);
	}

}
