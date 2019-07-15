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

}
