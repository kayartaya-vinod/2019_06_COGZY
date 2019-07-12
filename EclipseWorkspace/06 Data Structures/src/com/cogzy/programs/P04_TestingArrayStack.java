package com.cogzy.programs;

import com.cogzy.utils.ArrayStack;

public class P04_TestingArrayStack {

	public static void main(String[] args) {

		ArrayStack<Integer> nums = new ArrayStack<Integer>();
		
		
		System.out.println("stack contains: " + nums);
		System.out.println("nums.empty() == " + nums.empty() + ", nums.size() == " + nums.size());
		nums.push(12);
		System.out.println("nums.empty() == " + nums.empty() + ", nums.size() == " + nums.size());
		nums.push(124);
		nums.push(122);
		System.out.println("nums.empty() == " + nums.empty() + ", nums.size() == " + nums.size());
		nums.pop();
		System.out.println("nums.empty() == " + nums.empty() + ", nums.size() == " + nums.size());
		nums.pop();
		System.out.println("nums.empty() == " + nums.empty() + ", nums.size() == " + nums.size());
		nums.pop();
		System.out.println("nums.empty() == " + nums.empty() + ", nums.size() == " + nums.size());
		
		
//		System.out.println("Size of nums is " + nums.size());
//		nums.push(12);
//		nums.push(22);
//		nums.push(124);
//		nums.push(122);
//		nums.push(221);
//		nums.push(114);
//		nums.push(126);
//		nums.push(242);
//		nums.push(524);
//		nums.push(722);
//		nums.push(122);
//		System.out.println("Size of nums is " + nums.size());
//		System.out.println(nums);
//		int n;
//		n = nums.pop();
//		System.out.printf("Popped value is %d, stack is %s\n", n, nums);
//		n = nums.pop();
//		System.out.printf("Popped value is %d, stack is %s\n", n, nums);
//		n = nums.pop();
//		System.out.printf("Popped value is %d, stack is %s\n", n, nums);
//		n = nums.pop();
//		System.out.printf("Popped value is %d, stack is %s\n", n, nums);
//		
//		n = nums.peek();
//		System.out.printf("Top most element in the stack is %d\n", n);
//		n = nums.peek();
//		System.out.printf("Top most element in the stack is %d\n", n);
//		n = nums.peek();
//		System.out.printf("Top most element in the stack is %d\n", n);
//		n = nums.peek();
//		System.out.printf("Top most element in the stack is %d\n", n);
	}
}
