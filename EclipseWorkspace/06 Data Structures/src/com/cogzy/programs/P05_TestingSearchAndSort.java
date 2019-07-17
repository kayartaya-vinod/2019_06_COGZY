package com.cogzy.programs;

import com.cogzy.entity.Person;
import com.cogzy.utils.ArrayUtil;

public class P05_TestingSearchAndSort {

	public static void main(String[] args) {
		// testSequentialSearchAlgorithm();
		// testBinarySearchAlgorithm();
		// testingBinarySearchForPersons();
		testingSort("bubble"); // or bubble
	}

	static void testingSort(String sortType) {
		Integer[] nums = { 10, 485, 18, 96, -385, 22, 596, 23, 120, 595, 29, 39, 6866, 34, 567, 89 };
		System.out.println("Before sorting...");
		for (Integer n : nums) {
			System.out.print(n + ", ");
		}
		System.out.println();

		if (sortType.equals("linear")) {
			ArrayUtil.linearSort(nums);
		} else if (sortType.equals("bubble")) {
			ArrayUtil.bubbleSort(nums);
		} 

		System.out.println("After sorting...");
		for (Integer n : nums) {
			System.out.print(n + ", ");
		}
		System.out.println();

	}

	static void testingBinarySearchForPersons() {

		Person[] people = { new Person("Satya", 85.0, 160), new Person("Harish", 75.0, 170),
				new Person("Vinod", 81.7, 175), new Person("Naveen", 80.1, 182), new Person("Shyam", 74.7, 186) };

		Person p1 = new Person("", 0.0, 181);
		int index = ArrayUtil.binarySearch(p1, people);
		System.out.printf("index = %d\n", index);

	}

	static void testBinarySearchAlgorithm() {
		Integer[] nums = { -3, 10, 18, 22, 23, 29, 34, 39, 89, 96, 120, 485, 567, 595, 596, 686 };
		int searchNum = 18;
		int index;

		index = ArrayUtil.binarySearch(searchNum, nums);
		System.out.printf("searchElem = %d, index = %d\n", searchNum, index);

		searchNum = 10;
		index = ArrayUtil.binarySearch(searchNum, nums);
		System.out.printf("searchElem = %d, index = %d\n", searchNum, index);

		searchNum = 89;
		index = ArrayUtil.binarySearch(searchNum, nums);
		System.out.printf("searchElem = %d, index = %d\n", searchNum, index);

		searchNum = 19;
		index = ArrayUtil.binarySearch(searchNum, nums);
		System.out.printf("searchElem = %d, index = %d\n", searchNum, index);

		searchNum = 1999;
		index = ArrayUtil.binarySearch(searchNum, nums);
		System.out.printf("searchElem = %d, index = %d\n", searchNum, index);

		searchNum = -25;
		index = ArrayUtil.binarySearch(searchNum, nums);
		System.out.printf("searchElem = %d, index = %d\n", searchNum, index);
	}

	static void testSequentialSearchAlgorithm() {
		Integer[] nums = { 10, 485, 18, 96, -385, 22, 596, 23, 120, 595, 29, 39, 6866, 34, 567, 89 };
		int searchNum = 19;
		int index;

		index = ArrayUtil.sequentialSearch(searchNum, nums);
		System.out.println("index = " + index);

		searchNum = 10;
		index = ArrayUtil.sequentialSearch(searchNum, nums);
		System.out.println("index = " + index);

		searchNum = 89;
		index = ArrayUtil.sequentialSearch(searchNum, nums);
		System.out.println("index = " + index);

	}

}
