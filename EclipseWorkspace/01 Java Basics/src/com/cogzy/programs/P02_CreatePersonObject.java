package com.cogzy.programs;

import com.cogzy.model.Person;

public class P02_CreatePersonObject {

	public static void main(String[] args) {
		
		// reference declaration
		Person p1;
		
		// reference assignment to an object
		p1 = new Person();
		p1.setName("Vinod");
		p1.setHeight(175);
		p1.setWeight(80.4);
		
		Person p2 = new Person();
		p2.setName("John");
		p2.setHeight(180);
		p2.setWeight(85.5);
		
		Person p3 = new Person("Vinay");
		Person p4 = new Person("Shyam", 182, 82.0);

		// p1.printDetails();
		// p2.printDetails();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}
}
