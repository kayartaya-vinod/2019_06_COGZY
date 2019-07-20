package com.cogzy.progrms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cogzy.entity.Person;

public class P04_CollectionsDemo {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("James", 77.2, 180));
		persons.add(new Person("Ramesh", 77.3, 169));
		persons.add(new Person("Vinod", 81.5, 165));
		persons.add(new Person("Naveen", 79.3, 175));
		persons.add(new Person("Vinod", 81.5, 170));
		
		System.out.println("Before sorting...");
		for(Person p: persons) {
			System.out.println(p);
		}
		Collections.sort(persons);
		System.out.println("After sorting...");
		for(Person p: persons) {
			System.out.println(p);
		}
		
		// cmp is an anonymous object that knows how to compare
		// two person objects
		Comparator<Person> cmp = new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getHeight() - p2.getHeight();
			}
		};
		
		Collections.sort(persons, cmp);
		System.out.println("After sorting by height...");
		for(Person p: persons) {
			System.out.println(p);
		}
		
	}
	
	public static void main_1(String[] args) {

		List<Integer> nums = new ArrayList<>();
		initList(nums);
		System.out.println(nums);
		Collections.sort(nums);
		System.out.println(nums);
		Collections.shuffle(nums);
		System.out.println(nums);
		Integer mx = Collections.max(nums);
		System.out.println("mx = " + mx);
		Integer mn = Collections.min(nums);
		System.out.println("mn = " + mn);
		
	}

	static void initList(List<Integer> nums) {
		for (int i = 0; i < 10; i++) {
			nums.add(randBetween(500, 1000));
		}
	}

	static int randBetween(int start, int end) {
		return start + (int) (Math.random() * (end - start));
	}
}
