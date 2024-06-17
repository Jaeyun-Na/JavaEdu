package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;


public class Student {

	private String name;
//	private int[] marks;
//	Student 클래스 내부에서 마크를 배열에서 ArrayList로 변경
	private ArrayList<Integer> marks = new ArrayList<Integer>();

//	public Student(String name, int[] marks) {
//		this.name = name;
//		this.marks = marks;
//	}
	public Student(String name, int[] marks) {
		this.name = name;
		
		for(int mark: marks) {
		this.marks.add(mark);
		}
	}

//	public int getNumberOfMarks() {
//		// TODO Auto-generated method stub
//		return marks.length;
//	}
	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		return marks.size();
	}
	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int mark : marks) {
			sum += mark;
		}
		return sum;
	}

//	public int getMaximumMark() {
////		int maximum = 0;
//		int maximum = Integer.MIN_VALUE;;
//		for(int mark : marks) {
//			if(mark > maximum) {
//				maximum = mark;
//			}
//		}
//		return maximum;
//	}
//	기존 방법은 로직과 최댓값을 직접 입력하는 방식이였지만, ArrayList에는 많은 메소드를 포함하고 있다 그중 collections 메소드를 사용.
//	max, min
	public int getMaximumMark() {
		return Collections.max(marks);
	}

//	public int getMinimumMark() {
//		int minimum = Integer.MAX_VALUE;
//		for(int mark : marks) {
//			if(mark < minimum) {
//				minimum = mark;
//			}
//		}
//		return minimum;
//	}
	public int getMinimumMark() {
		return Collections.min(marks);
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
	
	public String toString() {
		return name + marks;
	} 
}
