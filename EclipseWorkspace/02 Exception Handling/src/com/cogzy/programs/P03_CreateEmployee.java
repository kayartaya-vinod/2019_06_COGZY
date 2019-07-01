package com.cogzy.programs;

import com.cogzy.model.Employee;
import com.cogzy.model.InvalidIdException;
import com.cogzy.model.InvalidNameException;
import com.cogzy.model.InvalidSalaryException;

public class P03_CreateEmployee {

	public static void main(String[] args) {

		Employee e1, e2;

		e1 = new Employee();

		try {
			e1.setId(123);
			e1.setName("Anu");
			e1.setSalary(22500.0);
			e1.print();

			e2 = new Employee(6756, "", 22000.0);
			e2.print();

		} catch (InvalidIdException e) {
			System.out.println("Problem with id: " + e.getMessage());
		} catch (InvalidNameException e) {
			System.out.println("Problem with name: " + e.getMessage());
		} catch (InvalidSalaryException e) {
			System.out.println("Problem with salary: " + e.getMessage());
		}

	}
}
