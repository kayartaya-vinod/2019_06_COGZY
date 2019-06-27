package com.cogzy.model;

public class Triangle extends Shape {
	private double base;
	private double height;

	public Triangle() {
	}

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void printArea() {
		double area = 0.5 * base * height;
		System.out.printf("Area of triangle with base=%.2f and height=%.2f is %.2f\n", base, height, area);
	}
	
	

}
