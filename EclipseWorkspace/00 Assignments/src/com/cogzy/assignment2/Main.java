package com.cogzy.assignment2;

public class Main {
	
	static boolean isLeap(int year) {
		return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	}

	static boolean isValidDate(int year, int month, int day) {

		if (year < 1) {
			return false;
		}

		if (month < 1 || month > 12) {
			return false;
		}

		int maxDaysInMonth;
		
		switch (month) {
		case 2:
			maxDaysInMonth = isLeap(year) ? 29 : 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			maxDaysInMonth = 30;
			break;
		default:
			maxDaysInMonth = 31;
		}

		if (day < 1 || day > maxDaysInMonth) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		boolean result;
		int year, month, day;

		year = 2018;
		month = 13;
		day = 1;
		result = isValidDate(year, month, day);
		System.out.printf("%d-%d-%d --> %s\n\n", year, month, day, result);

		year = 2018;
		month = 2;
		day = 29;
		result = isValidDate(year, month, day);
		System.out.printf("%d-%d-%d --> %s\n\n", year, month, day, result);

		year = 2016;
		month = 2;
		day = 29;
		result = isValidDate(year, month, day);
		System.out.printf("%d-%d-%d --> %s\n\n", year, month, day, result);

		year = 2019;
		month = 6;
		day = 31;
		result = isValidDate(year, month, day);
		System.out.printf("%d-%d-%d --> %s\n\n", year, month, day, result);

	}
}
