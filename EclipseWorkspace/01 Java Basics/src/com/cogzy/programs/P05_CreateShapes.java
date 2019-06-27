package com.cogzy.programs;

import com.cogzy.model.Circle;
import com.cogzy.model.Rectangle;
import com.cogzy.model.Shape;
import com.cogzy.model.Triangle;

public class P05_CreateShapes {
	
	public static void main(String[] args) {
		
		Shape[] shapes = {
			new Rectangle(12, 34),
			new Rectangle(11, 22),
			new Circle(12.34),
			new Triangle(12, 34)
		};
		
		for (int i = 0; i < shapes.length; i++) {
			Shape s = shapes[i]; // could be Rectangle, Circle or a Triangle
			// System.out.println("s is an instanceof " + s.getClass().getName());
			s.printArea();
			
			if(s instanceof Rectangle) {
				// superclass object cast to subclass reference --> downcasting
				Rectangle r = (Rectangle) s; 
				// while r and s refer to the same object, using "s" you can only call
				// the functions of Shape and Object type, where as using "r" you can all all methods
				// of Rectange (, Shape and Object)
				
			}
		}
		
	}

}
