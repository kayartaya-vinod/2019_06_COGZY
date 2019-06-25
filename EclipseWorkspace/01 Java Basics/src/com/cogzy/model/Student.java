package com.cogzy.model;

// a class can have only one super class (no multiple inheritance)
// if there is no explicity superclass specified, java.lang.Object becomes the superclass automatically
// java.lang.Object is the only class in Java that does not have super class
// hence, java.lang.Object is sometimes referred as cosmic class
public class Student extends Person {
	private int rollno;
	private String branch;
	private double gpa;

	public Student() {
		// by default the superclass no-arg constructor is invoked here
		// like: super();
	}

	public Student(String name, int rollno, String branch, double gpa) {
		super(name); // explicit call to a superclass constructor
		this.rollno = rollno;
		this.branch = branch;
		this.gpa = gpa;
	}

	public Student(String name, int height, double weight, int rollno, String branch, double gpa) {
		super(name, height, weight);

		this.rollno = rollno;
		this.branch = branch;
		this.gpa = gpa;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public void printDetails() {

		System.out.println("Rollno  = " + rollno);
		super.printDetails();
		System.out.println("GPA     = " + gpa);
		System.out.println("Branch  = " + branch);
		
		System.out.println("----------------------------");
	}
	

}
