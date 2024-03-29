package com.cogzy.model;

public class Person { // extends Object{

	// data members (state)
	private String name; // 8 bytes
	private int height; // 4 bytes
	private double weight; // 8 bytes

	// aggregation (HAS-A)
	// composition is another type of aggregation (stronger form of aggregation)
	private Address address = new Address(); 
	// no need to import, since Address is in the same package as Person

	// constructors
	// 1. constructors donot have return types (not even void)
	// 2. constructors have the same name as class name
	// 3. constructors are invoked (executed) automatically when "new" keyword is
	// used
	// 4. constructors cannot be invoked using an object explicitly
	// 5. more than one constructors can exist in a class, as long as they different
	// in terms of arguments
	// 6. compiler creates a constructor by default if there is no other
	// constructors
	// 7. general use of constructor is to initialize the data members with some
	// values

	public Person() {
		// this is a.k.a the default constructor or no-args constructor
		// good practice add this constructor to avoid futuristic errors
	}

	public Person(String name) {
		// the keyword "this" is an implicit reference variable to the this object
		this.name = name;
	}

	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	// member functions (methods) (behavior)

	// accessor / readable property
	public String getName() {
		return name;
	}

	// mutator / writable property
	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height < 0) {
			throw new RuntimeException("Invalid value for height; must be >0");
		}
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight < 0) {
			throw new RuntimeException("Invalid value for weight; must be >0");
		}
		this.weight = weight;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void printDetails() {
		System.out.println("Name    = " + name);
		System.out.println("Height  = " + height + " cms");
		System.out.println("Weight  = " + weight + " kg");
		System.out.println("Address = " + address.getStreet() + " " + 
				address.getArea() + " " +
				address.getCity() + " " + 
				address.getState());
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + 
				", address = " + address + "]";
	}

}
