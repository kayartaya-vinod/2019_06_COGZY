package com.cogzy.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
//@EqualsAndHashCode(of = { "name", "height" })
public class Person implements Comparable<Person> {
	private String name;
	private double weight;
	private int height;
	
	// defines the natural ordering for class Person
	@Override
	public int compareTo(Person other) {
		
		int c = name.compareTo(other.name);
		if(c==0) {
			c = Double.compare(weight, other.weight);
			if(c==0) {
				c = Integer.compare(height, other.height);
			}
		}
		
		return c;
	}
	
}
