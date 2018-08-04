package com.serialization;

import java.io.Serializable;

public class MyClass implements Serializable {// class
	private int id;
	private String name;
	private double salary;

	public MyClass(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
