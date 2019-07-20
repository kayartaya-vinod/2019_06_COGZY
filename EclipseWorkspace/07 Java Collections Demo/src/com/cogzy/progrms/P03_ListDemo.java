package com.cogzy.progrms;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class P03_ListDemo {

	public static void main(String[] args) {

		// List<String> names = new LinkedList<>();
		List<String> names = new ArrayList<>(); 
		names.add("Vinod");
		names.add("Vinod");
		names.add("Ramesh");
		names.add(0, "Kumar");
		names.add(2, "Shyam");
		names.add(5, "Kiran");
		names.add(6, "Gaurav");
		System.out.println(names);

//		long start = new Date().getTime();
//		for (int i = 0; i < 500000; i++) {
//			names.add("Test");
//		}
//		long end = new Date().getTime();
//		System.out.printf("Totoal time taken is %dms\n", end - start);

		System.out.println("Elements in the names list:");
		System.out.println("---------------------------");
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String s = it.next(); // moves the cursor to the next data
			System.out.println(s);
			if(s.equals("Shyam")) break;
		}
		
		System.out.println();
		System.out.println("Remaining names are:");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Vector<String> data = new Vector<>();
		data.add("lenovo");
		data.add("macbook");
		data.add("acer");
		data.add("hp");
		data.add("dell");
		data.add("asus");

		System.out.println("Values in data: ");
		Enumeration<String> elems = data.elements();
		while(elems.hasMoreElements()) {
			System.out.println(elems.nextElement());
		}
	}
}
