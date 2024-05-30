package com.in28minutes.arrays;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		return marks.length;
	}

}
