package com.cogzy.programs;

import com.cogzy.model.Address;
import com.cogzy.model.Person;

public class P03_CreatePersonWithAddress {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("Vinod");
		p1.setHeight(175);
		p1.setWeight(80.5);
		p1.getAddress().setStreet("1st cross 1st main");
		p1.getAddress().setArea("ISRO layout");
		p1.getAddress().setCity("Bangalore");
		p1.getAddress().setState("Karnataka");
		
		Address addr = new Address();
		addr.setStreet("7th cross 2nd main");
		addr.setArea("Vikroli");
		addr.setCity("Mumbai");
		addr.setState("Maharashtra");
		
		Person p2 = new Person("Rohit", 180, 85.0);
		p2.setAddress(addr);
		
		p1.printDetails();
		p2.printDetails();
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}
}
