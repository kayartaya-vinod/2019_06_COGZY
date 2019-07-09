package com.cogzy.programs;

import com.cogzy.utils.DoublyLinkedList;

public class P02_TestingDoublyLinkedList {

	public static void main(String[] args) {

		DoublyLinkedList<Integer> nums = new DoublyLinkedList<Integer>();
		
		
		nums.addAtStart(20); // 20
		System.out.println(nums);
		nums.addAtStart(50); // 50, 20
		System.out.println(nums);
		nums.addAtEnd(30); // 50, 20, 30
		System.out.println(nums);
		nums.addAtStart(35); // 35, 50, 20, 30
		System.out.println(nums);
		nums.addAtStart(10); // 10, 35, 50, 20, 30
		System.out.println(nums);
		nums.addAtEnd(12);  // 10, 35, 50, 20, 30, 12
		System.out.println(nums);
		nums.addAtIndex(44, 0); // 44, 10, 35, 50, 20, 30, 12
		System.out.println(nums);
		nums.addAtIndex(99, 6); // 44, 10, 35, 50, 20, 30, 12, 99
		System.out.println(nums);
		nums.addAtIndex(88, 3); // 44, 10, 35, 88, 50, 20, 30, 12, 99
		System.out.println(nums);
		nums.addAtIndex(77, 1); // 44, 77, 10, 35, 88, 50, 20, 30, 12, 99
		System.out.println(nums);
		
		int index = 3;
		Integer n = nums.get(index);
		System.out.printf("Element at index %d is %d\n", index, n); // 20

		
		index = 6;
		n = nums.get(index);
		System.out.printf("Element at index %d is %d\n", index, n); // 20

		index = 9;
		n = nums.get(index);
		System.out.printf("Element at index %d is %d\n", index, n); // 99
		
		index = 0;
		n = nums.get(index);
		System.out.printf("Element at index %d is %d\n", index, n); // 99
		
		// index = 25;
		// n = nums.get(index);
		// System.out.printf("Element at index %d is %d\n", index, n); // IndexOutOfBoundsException
		
		index = 3;
		n = nums.deleteAtIndex(index);
		System.out.printf("After deleting element at index %d, n = %d\n", index, n); // 35
		System.out.println(nums);

		index = 3;
		n = nums.deleteAtIndex(index);
		System.out.printf("After deleting element at index %d, n = %d\n", index, n); // 35
		System.out.println(nums);
		
		index = 3;
		nums.set(999, index); // 44, 77, 10, 999, 20, 30, 12, 99
		System.out.printf("After setting 999 at index %d, nums is %s\n",index, nums);
		
		index = 7;
		nums.set(777, index);
		System.out.printf("After setting 999 at index %d, nums is %s\n",index, nums);
		
		n = nums.get(index);
		System.out.printf("Element at index %d is %d\n", index, n); // 99
		
		index = 0;
		n = nums.get(index);
		System.out.printf("Element at index %d is %d\n", index, n); // 99
		
		// 44, 77, 10, 999, 20, 30, 12, 777
		n = 20;
		index = nums.indexOf(n);
		System.out.printf("Index of %d in nums is %d\n", n, index);
		
		n = 777;
		index = nums.indexOf(n);
		System.out.printf("Index of %d in nums is %d\n", n, index);
		
		n = 200;
		index = nums.indexOf(n);
		System.out.printf("Index of %d in nums is %d\n", n, index);
		

		n = 44;
		index = nums.indexOf(n);
		System.out.printf("Index of %d in nums is %d\n", n, index);

		n=30;
		boolean found = nums.exists(n);
		System.out.printf("%d found is %s\n", n, found);
		
		n=55;
		found = nums.exists(n);
		System.out.printf("%d found is %s\n", n, found);
		
		
		nums.empty();
		System.out.println("After deleting all elements, nums is " + nums);
		
	}

}
