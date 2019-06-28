package com.cogzy.programs;

public class P01_ExceptionDemo {

	public static void main(String[] args) {

		String input;
		try {
			input = args[0]; // "100"
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Argument#1 is missing");
			return;
		}

		int num;

		try {
			num = Integer.parseInt(input); // 100
		} catch (NumberFormatException e) {
			System.out.println("Argument#1 is not an int!");
			return;
		}

		int den;
		int quotient;
		try {
			input = args[1];
			den = Integer.parseInt(input);
			quotient = num / den;
		} catch (NumberFormatException e) {
			System.out.println("Argument#2 is not an int!");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Argument#2 is missing, but required!");
			return;
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero!");
			return;
		}

		System.out.printf("%d divided by %d results in %d\n", num, den, quotient);

		System.out.println("We have reached the end of main() function!");
	}

}
