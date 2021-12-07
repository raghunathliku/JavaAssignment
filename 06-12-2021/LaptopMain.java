package com.technoelevate.springpractice.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technoelevate.springpractice.beans.Laptop;

public class LaptopMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("laptopc.xml");
		Laptop laptop=(Laptop) context.getBean("lap");
		System.out.println(laptop);

	}

}
