package com.cogzy.progrms;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.cogzy.entity.Person;

public class P02_SetDemo {

	public static void main(String[] args) {
		
		// for use of HashSet with Person elements, Person class must override hashCode() and equals()
		// methods, and the logic must make use of the member variables name/weight/height
		
		// for TreeSet with Person element, Person must implement the interface Comparable<Person>
		
		Set<Person> persons = new TreeSet<Person>();

		Person p1 = new Person("Vinod", 81.3, 175);
		persons.add(p1);

		Person p2 = new Person("Ramesh", 77.3, 169);
		persons.add(p2);

		Person p3 = new Person("Vinod", 88.0, 175);
		persons.add(p3);

		Person p4 = new Person("Naveen", 79.3, 175);
		persons.add(p4);
		
		persons.add(new Person("Vinod", 88.0, 170));
		

//		System.out.println("p1==p2 is " + (p1 == p2));
//		System.out.println("p1.hashCode()==p3.hashCode() is " + (p1.hashCode() == p3.hashCode()));
//		System.out.println("p1.equals(p3) is " + p1.equals(p3));

		System.out.println("persons.size = " + persons.size());
		for(Person p: persons) {
			System.out.println(p);
		}
	}

	public static void main_2(String[] args) {
		Set<Integer> nums = new TreeSet<Integer>();
		nums.add(123);
		nums.add(123);
		nums.add(22);
		nums.add(32);
		nums.add(123);
		nums.add(545);
		nums.add(123);
		nums.add(444);
		System.out.println(nums);

	}

	public static void main_1(String[] args) {

		Set<String> names = new HashSet<>();
		names.add("Vinod");
		names.add("Vinod");
		names.add("Ramesh");
		names.add("Vinod");
		names.add("Vinod");
		names.add("Harish");
		names.add("Kiran");
		names.add("Pradeep");
		names.add("Vinod");

		System.out.println("names.size = " + names.size());
		System.out.println(names);
	}
}
