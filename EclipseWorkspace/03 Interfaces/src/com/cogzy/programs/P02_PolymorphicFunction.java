package com.cogzy.programs;

import com.cogzy.model.Circle;
import com.cogzy.model.Rectangle;
import com.cogzy.model.Shape;
import com.cogzy.model.Triangle;

public class P02_PolymorphicFunction {

	// polymorphic function
	// arguments and/or return types are abstract types (interfaces).
	// This is called loose coupling, where the printArea function accepts any type of Shapes,
	// and not bound to a specific Shape like Triangle
	static void printArea(Shape sh) {
		sh.printArea();
	}
	
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Circle c1 = new Circle(12.34);
		Rectangle r1 = new Rectangle(12.34, 45.67);
		
		printArea(c1);
		printArea(t1);
		printArea(r1);
	}
}
