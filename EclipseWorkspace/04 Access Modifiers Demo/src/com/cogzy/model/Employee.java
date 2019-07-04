package com.cogzy.model;

public class Employee {

	// abstract function:
	// 1. no method body (as if incomplete method)
	// 2. class must also be declared as abstract, so that no instance can be created
	
	// abstract class:
	// 1. object of an abstract cannot be created
	// 2. abstract class need not have any abstract methods at all
	// 3. abstract class may have any number of concrete (non-abstract) functions
	
	// final variable:
	// 1. variable must be initialized (and at max once)
	// 2. can be lazy (in constructor) or eager initialization
	
	// final function:
	// 1. method cannot be overridden in the subclass
	
	// final class:
	// 1. you cannot inherit from a final class (no subclass possible)
	
	// static variables:
	// 1. these variables are not part of object space (heap)
	// 2. will be kept in data segment, and accessible using the name of the class (like Math.PI)
	
	// static functions:
	// 1. these are accessed using the class name and not object reference
	// (For example, Math.sqrt(12.34); )
	// 2. bring in the concept of global function to Java.
	// 3. STATIC FUNCTIONS CAN ACCESS ONLY STATIC MEMBERS OF THE SAME CLASS
	// 4. STATIC FUNCTIONS CANNOT ACCESS NON-STATIC MEMBERS OF THE SAME CLASS
	
	
	private final String createdBy;
	
	public Employee() {
		this.createdBy = "Vinod Kumar K";
	}
	
	public Employee(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public final void printReport() {
	}
	
	// only nested classes can be marked as static 
	static class Test {
	}
}
