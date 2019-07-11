package com.cogzy.utils;

public class BinarySearchTree<T extends Comparable<T>> {

	private Node<T> start;

	public BinarySearchTree() {
	}

	public void add(T data) {
		Node<T> newNode = new Node<T>(data);

		add(newNode, start);

	}

	private void add(Node<T> newNode, Node<T> currNode) {

		if (currNode == null) {
			// happens only for the first element
			start = newNode;
			return;
		}

		// if the return value of data.compareTo(temp.data) < 0 --> data < temp.data
		// if the return value of data.compareTo(temp.data) is 0 --> data == temp.data
		// if the return value of data.compareTo(temp.data) > 0 --> data > temp.data
		if (newNode.data.compareTo(currNode.data) < 0) {
			if (currNode.left == null) {
				currNode.left = newNode;
			} else {
				// navigate to left onlt if currNode.left != null
				add(newNode, currNode.left);
			}
		} else if (newNode.data.compareTo(currNode.data) > 0) {
			if (currNode.right == null) {
				currNode.right = newNode;
			} else {
				// navigate to right
				add(newNode, currNode.right);
			}
		}
	}
	
	public void delete(T data) {
		
	}
	
	@Override
	public String toString() {
		return "[]";
	}
	
	public void print() {
		print(start);
	}

	private void print(Node<T> currNode) {
		if (currNode == null) {
			System.out.print("No data in the tree!\n");
			return;
		}

		// navigate to left
		if (currNode.left != null) {
			print(currNode.left);
		}
		// access the element
		System.out.print(currNode.data + ", ");
		// navigate to right
		if (currNode.right != null) {
			print(currNode.right);
		}
	}

	private class Node<T> {
		private T data;
		private Node<T> left;
		private Node<T> right;

		public Node(T data) {
			this.data = data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public T getData() {
			return data;
		}

		public void setLeft(Node<T> left) {
			this.left = left;
		}

		public Node<T> getLeft() {
			return left;
		}

		public void setRight(Node<T> right) {
			this.right = right;
		}

		public Node<T> getRight() {
			return right;
		}
	}

}
