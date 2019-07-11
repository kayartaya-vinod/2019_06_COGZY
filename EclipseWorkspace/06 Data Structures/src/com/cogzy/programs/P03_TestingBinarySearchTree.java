package com.cogzy.programs;

import com.cogzy.utils.BinarySearchTree;

public class P03_TestingBinarySearchTree {
	
	public static void main(String[] args) {
		BinarySearchTree<String> tree = new BinarySearchTree<String>();
		tree.add("Vinod");
		tree.add("ajay");
		tree.add("Anil");
		tree.add("Vishal");
		tree.add("Vinay");
		tree.add("Shyam");
		tree.add("Suresh");
		tree.add("vinod");
		tree.add("Ramesh");
		
		tree.print();
		
		tree.delete("Vinay");
		tree.print();
		
		System.out.println(tree);
	}
	
	public static void main_1(String[] args) {
		
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

		tree.add(51);
		tree.add(21);
		tree.add(7);
		tree.add(5);
		tree.add(51);
		tree.add(75);
		tree.add(56);
		tree.add(53);
		tree.add(65);
		tree.add(51);
		tree.add(10);
		
		tree.print();
	}

}
