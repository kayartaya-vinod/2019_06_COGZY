package com.cogzy.model;

public class Rectangle implements Shape {

	private double width;
	private double breadth;

	public Rectangle() {
	}

	public Rectangle(double width, double breadth) {
		this.width = width;
		this.breadth = breadth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public void printArea() {
		double area = width * breadth;
		System.out.printf("Area of rectangle with width=%.2f and breadth=%.2f is %.2f sq.units\n",
				width, breadth, area);
	}

}
