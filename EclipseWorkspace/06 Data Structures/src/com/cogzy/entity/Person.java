package com.cogzy.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class Person implements Comparable<Person>{
	private String name;
	private double weight;
	private int height;
	
	@Override
	public int compareTo(Person other) {
		return this.height-other.height;
	}
}
