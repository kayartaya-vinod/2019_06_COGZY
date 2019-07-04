package com.cogzy.model;

public class Circle {

	public static final double PI = 3.14156;
	private double radius;
	private String color;
	
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(String color) {
		this.color = color;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
