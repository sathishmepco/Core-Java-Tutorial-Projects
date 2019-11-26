package com.java.sathish;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {

		//a and b
		Employee a = this;
		Employee b = o;
		
		/*
		 * a.salary > b.salary return 1
		 * a.salary < b.salary return -1
		 * a.salary == b.salary return 0
		 */
		
		if(a.getSalary() > b.getSalary())
			return 1;
		if(a.getSalary() < b.getSalary())
			return -1;
		return 0;
	}
	
	

}
