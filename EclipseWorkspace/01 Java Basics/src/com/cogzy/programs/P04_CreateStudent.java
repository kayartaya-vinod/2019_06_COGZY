package com.cogzy.programs;

import com.cogzy.model.Student;

public class P04_CreateStudent {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.printDetails();
		
		Student st2 = new Student("Ramesh", 7788, "Mech", 4.3);
		Student st3 = new Student("Suresh", 157, 75, 6756, "EC", 4.6);
		
		st2.printDetails();
		st3.printDetails();
		
	}
}
