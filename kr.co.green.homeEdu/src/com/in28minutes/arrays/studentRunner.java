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
		String name = "Kim";
		
		Student student = new Student("Kim",marks);
		Student student1 = new Student("Kim",new int[] {97,98,100});
		Student student2 = new Student("Lee",new int[] {97,98});
		Student student3 = new Student("Choi",new int[] {97,98,100,99});
		 
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
		
		System.out.println(student);
////////////////////////////////////////////////////////////////////////////////////////		
// student 클래스에서 메소드를 이용하여 인덱스에 있는 마크를 추가, 제거
		student.addNewMark(35);
		
		System.out.println(student);
		
		student.removeMarkAtIndex(1);

		System.out.println(student);
	}

}
