package com.cogzy.programs;

import com.cogzy.model.Person;

public class P02_CreatePersonArray {

	public static void main(String[] args) {
		
		Person[] people; // reference in the stack (reference of Person array type)

		people = new Person[5]; // Arrayof 5 Person references (not objects) in the HEAP
		
		people[0] = new Person("Ashish", 190, 90.4); // new Person object in the HEAP
		people[1] = new Person("Krishna", 170, 77.9);
		people[4] = new Person();
		
		
//		for (int i = 0; i < people.length; i++) {
//			Person p = people[i];
//			System.out.println("p is " + p);
//		}
		
		for(Person p: people) {
			System.out.println("p is " + p);
		}
		
	}
}
