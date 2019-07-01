package com.cogzy.model;

public class Employee {
	private int id;
	private String name = "";
	private double salary = 15000.0;

	public Employee() {
	}

	public Employee(int id, String name, double salary) throws InvalidIdException, InvalidNameException, InvalidSalaryException {
		setId(id);
		setName(name);
		setSalary(salary);
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) throws InvalidIdException {

		if (id <= 0) {
			// throw is like "return", but more stronger
			// takes the control away from this function to the caller
			// throw new Exception("Invalid id; id must be >0");
			throw new InvalidIdException("Invalid id; id must be >0, but got " + id);
		}

		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws InvalidNameException {
		if (name.length() < 3) {
			throw new InvalidNameException("At least 3 letters required for name");
		}
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) throws InvalidSalaryException {
		if (salary < 15000) {
			throw new InvalidSalaryException("Salary must be >= Rs.15000/-, but got Rs." + salary + "/-");
		}
		this.salary = salary;
	}

	public void print() {
		System.out.println("Id      : " + id);
		System.out.println("Name    : " + name);
		System.out.println("Salary  : Rs." + salary);
		System.out.println();
	}
}
