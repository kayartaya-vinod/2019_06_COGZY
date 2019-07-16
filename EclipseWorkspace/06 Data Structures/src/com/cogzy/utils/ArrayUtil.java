package com.cogzy.utils;

public final class ArrayUtil {

	private ArrayUtil() {
	}

	public static <T> int sequentialSearch(T searchElem, T[] array) {
		for (int i = 0; i < array.length; i++) {
			if (searchElem.equals(array[i])) {
				return i;
			}
		}
		return -1;
	}

	public static <T extends Comparable<T>> int binarySearch(T searchElem, T[] array) {
		// binary search works only if the array is in ascending order
		int min = 0, max = array.length - 1, mid = -1; // start and end indices
		while (min <= max) {
			mid = (min + max) / 2;
			if (searchElem.compareTo(array[mid]) < 0) {
				max = mid - 1; // searchElem may exist in the first half of the array
			} else if (searchElem.compareTo(array[mid]) > 0) {
				min = mid + 1; // searchElem may exist in the second half of the array
			} else {
				break; // searchElem is equals to the array[mid]
			}
		}

		// if min<=max even after the loop is exit, that is because the
		// searchElem is found at index mid
		if (min <= max) {
			return mid;
		}

		return -1;
	}

	public static <T extends Comparable<T>> void linearSort(T[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				// array[j] < array[i]
				if (array[j].compareTo(array[i]) < 0) {
					// swap
					T tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}
			}
		}
	}

	public static <T extends Comparable<T>> void bubbleSort(T[] array) {

//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length - (1 + i); j++) {
//				if (array[j].compareTo(array[j + 1]) > 0) {
//					T tmp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = tmp;
//				}
//			}
//		}

		for (int i = array.length - 1; i > 0; i--) {
			for (int j = array.length - 1; j > array.length - (1 + i); j--) {
				if (array[j].compareTo(array[j - 1]) < 0) {
					T tmp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = tmp;
				}
			}
		}
	}
	
	public static <T extends Comparable<T>> void quickSort(T[] array) {
		// try this
	}

}





