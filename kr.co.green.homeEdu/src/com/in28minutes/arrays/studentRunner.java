package com.in28minutes.arrays;

public class studentRunner {
/*
	Student student = new Student(name. list of marks);
	int number = student.getNumberOfMarks();
	int sum = student.getTotalSumOfMarks();
	int maximumMark = student.getMaximumMark();
	int minimumMark = student.getMinimumMark();
	BigDecimal average = student.getAverageMarks();
 */

	public static void main(String[] args) {
		int [] marks = {99,98,100};
		Student student = new Student("Kim",marks);
		int number = student.getNumberOfMarks();
		System.out.println("number of marks : " + number);
	}

}
