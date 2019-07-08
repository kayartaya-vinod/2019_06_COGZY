package com.cogzy.programs;

import com.cogzy.utils.SinglyLinkedList;

public class P01_LinkedListDemo {

	public static void main(String[] args) {

		SinglyLinkedList<Integer> nums = new SinglyLinkedList<Integer>();
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
		

	}

}
