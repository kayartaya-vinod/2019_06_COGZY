package com.cogzy.utils;

public class ArrayStack<T> {

	private int index = -1;
	private int capacity = 10;
	private Object[] elements;

	public ArrayStack() {
		elements = new Object[capacity];
	}

	public ArrayStack(int capacity) {
		this.capacity = capacity;
		elements = new Object[capacity];
	}

	public void push(T data) {
		elements = ensureCapacity();
		elements[++index] = data;
	}

	@SuppressWarnings("unchecked")
	public T pop() {
		if (index == -1) {
			throw new IndexOutOfBoundsException("Stack is empty!");
		}
		T data = (T) elements[index];
		elements[index--] = null; // ensure garbage collection of the data being popped
		return data;
	}

	@SuppressWarnings("unchecked")
	public T peek() {
		if (index == -1) {
			throw new IndexOutOfBoundsException("Stack is empty!");
		}
		return (T) elements[index];
	}

	public boolean empty() {
		return index == -1;
	}

	private Object[] ensureCapacity() {

		if (index < elements.length - 1) {
			return elements;
		} else {
			Object[] temp = new Object[elements.length + capacity];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			return temp;
		}
	}

	public int size() {
		return index + 1;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ArrayStack [");
		for (int i = 0; i <= index; i++) {
			sb.append(elements[i]);
			sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}

}
