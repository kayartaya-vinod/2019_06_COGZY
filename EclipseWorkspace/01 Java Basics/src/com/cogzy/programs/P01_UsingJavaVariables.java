package com.cogzy.programs;

public class P01_UsingJavaVariables {
	
	public static void main(String[] args) {
		
		// primitives --> variables defined using keyword data types
		// keyword data types --> byte, short, int, long, float, double, char, boolean
		// primitive types --> are in lowercase only
		
		byte b1; // variable declaration (not definition)
		
		b1 = 12; // definition (value assignment)
		System.out.println("b1 is " + b1);
		
		int num = 2147483647;
		System.out.println("num is " + num);
		
		long bigNum = 9223372036854775807L;
		System.out.println("bigNum is " + bigNum);
		
		double biggerNum = 92233720368547758089999999999999977779999.0;
		System.out.println("biggerNum is " + biggerNum);
		
		System.out.println(biggerNum==92233720368547758089999999999999977779999.0);
		
		char ch = '\u00CB';
		System.out.println("ch is " + ch);
		
		boolean tf = false; // or false (cannot be treated as 1 and 0)
		System.out.println("tf is " + tf);
	}
	

}
