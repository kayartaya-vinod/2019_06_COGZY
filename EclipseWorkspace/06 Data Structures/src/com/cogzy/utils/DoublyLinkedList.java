package com.cogzy.utils;

public class DoublyLinkedList<T> {

	private Node<T> start, end;
	private int size = 0;

	public DoublyLinkedList() {
		start = end = null;
	}

	public void addAtStart(T data) {
	}

	public void addAtEnd(T data) {
	}

	public void addAtIndex(T data, int index) {
	}

	public int size() {
		return size;
	}

	public T get(int index) {
		return null;
	}

	public T deleteAtIndex(int index) {
		return null;
	}

	public void empty() {
	}

	public void set(T data, int index) {
	}

	public boolean exists(T data) {
		return false;
	}

	public int indexOf(T data) {
		return -1;
	}

	private class Node<T> {
		private T data;
		private Node<T> next;
		private Node<T> previous;

		private Node(T data) {
			this.data = data;
		}

		private void setData(T data) {
			this.data = data;
		}

		private T getData() {
			return data;
		}

		private void setNext(Node<T> next) {
			this.next = next;
		}

		private Node<T> getNext() {
			return next;
		}

		public void setPrevious(Node<T> previous) {
			this.previous = previous;
		}

		public Node<T> getPrevious() {
			return previous;
		}
	}
}
