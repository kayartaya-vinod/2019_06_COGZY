package com.cogzy.programs;

public class P01_CreateArray {

	// 1. Arrays are objects in Java
	// 2. Always created in the HEAP (never in STACK)
	//    (In C++ objects and arrays can be created in the STACK)
	// 3. Arrays have fixed size; canot grow or shrink
	// 4. Unlike C/C++ arrays can be initialized at the runtime.
	// 5. Every array has a readonly property called "length" representing the
	//    number of array elements
	// 6. Array elements are initialized by default to 0 (for numbers) and null (for
	//    references)
	// 7. Once array is created it cannot be re-initialized

	public static void main(String[] args) {

		// array reference declaration
		int[] x;

		int size = 4;

		// array object creation
		x = new int[size];

		System.out.println("x is: " + x);
		System.out.println("Elements of x are: ");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		x[0] = 123;
		x[1] = 23;
		x[2] = -45;
		x[3] = 4356;
		// x[4] = 100; // compiler is not aware of the size of the array; exception at
		// runtime.

		System.out.println("New elements of x are: ");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		x = new int[] { 19, 29, 30, 44, 23, 45 };
		x[2] = 300;

		System.out.println("New elements of x are: ");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
