package com.cogzy.progrms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class P01_MapDemo {

	public static void main(String[] args) {
		
		System.out.println("Maharashtra".hashCode());
		
		Map<String, String> data;
		
		data = new HashMap<String, String>();
		data.put("Karnataka", "Bangalore");
		data.put("Maharashtra", "Mumbai");
		data.put("Madhyapradesh", "Bhopal");
		data.put("Telangana", "Hyderabad");
		data.put("Karnataka", "Bengaluru");
		data.put("Gujarat", "Ahmedabad");
		
		System.out.println("data.size = " + data.size());
		System.out.println(data);
	
		// a set of keys
		System.out.println("States:");
		for(String state: data.keySet()) {
			System.out.println(state);
		}
		
		// a collection of values
		System.out.println("----------");
		System.out.println("Capital cities: ");
		for(String city: data.values()) {
			System.out.println(city);
		}
		
		// a set of entry objects; entry --> key/value pair
		System.out.println("----------");
		for(Entry<String, String> entry: data.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}

	}

}
