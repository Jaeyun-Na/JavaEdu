package com.in28minutes.arrays;

import java.math.BigDecimal;

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
		int [] marks = {97,98,100};
		
		Student student = new Student("Kim",marks);
		
		int number = student.getNumberOfMarks();
		System.out.println("number of marks : " + number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks : " + sum);
		
		int maximumMark = student.getMaximumMark();
		System.out.println("maximum of marks : " + maximumMark);
		
		int minimumMark = student.getMinimumMark();
		System.out.println("minimum of marks : " + minimumMark);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("average is : " + average);
	}

}
