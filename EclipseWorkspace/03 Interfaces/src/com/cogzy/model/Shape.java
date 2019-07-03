package com.cogzy.model;

// 1. An interface is an abstract type
// 2. You can create a reference variable of an interface
// 3. You CANNOT create an object of an interface
// 4. An object of an interface is realized via a class that implements the interface

// 5. Data members in an interface must be (or automaticall) public/static/final and initialized
// 6. Member methods CANNOT have body, since they are abstract by default.

// 7. When a class implements an interface, it is similar to the class extending an abstract class with all abstract methods
public interface Shape {
	double PI = 3.14156;
	
	void printArea();
}
