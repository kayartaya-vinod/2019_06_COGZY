package com.cogzy.programs;

import com.cogzy.model.Circle;
import com.cogzy.model.Rectangle;
import com.cogzy.model.Shape;
import com.cogzy.model.Triangle;

public class P01_CreateInterfaceObjects {

	public static void main(String[] args) {

		Shape sh;

		// sh = new Shape(); //error

		Triangle t1 = new Triangle();
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();

		// LHS --> Shape
		// RHS --> Triangle, which IS-A Shape
		sh = t1;
		sh.printArea();

		// LHS --> Shape
		// RHS --> Circle, which IS-A Shape
		sh = c1;
		sh.printArea();

		// LHS --> Shape
		// RHS --> Rectangle, which IS-A Shape
		sh = r1;
		sh.printArea();
		
		// Line numbers 23, 28 and 33 are identical to the compiler,
		// but produce different outputs at the runtime.
	}
}
