package com.java.sathish;

import java.util.Iterator;
import java.util.TreeSet;

public class MainProgram {
	
	public static void main(String[] args) {
		TreeSet<Employee> employees = new TreeSet<>();
		
		Employee emp1 = new Employee(1001, "Mahesh", 50000);
		Employee emp2 = new Employee(1002, "Ramesh", 75000);
		Employee emp3 = new Employee(1003, "Suresh", 40000);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		Iterator<Employee> iterator = employees.iterator();
		while( iterator.hasNext() ){
			System.out.println(iterator.next());
		}
	}

}
