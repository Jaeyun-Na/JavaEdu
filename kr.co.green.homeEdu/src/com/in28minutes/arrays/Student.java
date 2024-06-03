package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
//		int maximum = 0;
		int maximum = Integer.MIN_VALUE;;
		for(int mark : marks) {
			if(mark > maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}

	public int getMinimumMark() {
		int minimum = Integer.MAX_VALUE;
		for(int mark : marks) {
			if(mark < minimum) {
				minimum = mark;
			}
		}
		return minimum;
	}

	public BigDecimal getAverageMarks() {
		//sum
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		//total
		
//		정수만 나옴
//		return new BigDecimal(sum/number);
//		소수까지 포함
		return new BigDecimal(sum).divide(new BigDecimal(number),3, RoundingMode.UP);
//		98.66666666666 precision (3) 98.667 
//		소수점 3자리만 표시 그및은 반올림 처리
//		98.6665 Precision(3) Rounding mode(up/down)
//		소수점 3자리 표시 4번째 자리 올림/배림
		
	}
}
