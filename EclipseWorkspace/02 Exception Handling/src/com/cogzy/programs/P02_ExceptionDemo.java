package com.cogzy.programs;

public class P02_ExceptionDemo {

	public static void main(String[] args) {

		try {
			String input;
			input = args[0];
			int num = Integer.parseInt(input);
			input = args[1];
			int den = Integer.parseInt(input);
			int quotient = num / den;
			System.out.printf("%d divided by %d results in %d\n", num, den, quotient);
		} catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("There was an error while executing the program.");
			System.exit(0);
		} finally {
			System.out.println("This is a message from the finally block!");
		}

		System.out.println("We have reached the end of main() function!");
	}

}
