package com.cogzy.model;


// an abstract can be used for creating a reference variable but cannot be used for
// creating an object.
// For example, 
// Shape s1; // no problem
// s1 = new Shape(); // error
public abstract class Shape {
	
	// an abstract function/method can only be part of an abstract class
	public abstract void printArea() ;
	
}

// an abstract class may have 0 or more abstract functions