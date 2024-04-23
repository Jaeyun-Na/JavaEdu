package com.in.udemy.javaClass;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principal;
	BigDecimal interest;
	
	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
		
	}

	public BigDecimal calculatoeTotalvalue(int noOfYears) {
		//1�� ����
//		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
//		
//		BigDecimal totalValue =	principal.add(
//				principal.multiply(interest)
//				.multiply(noOfYearsBigDecimal)
//				);
		//2�� ����
		BigDecimal totalValue = principal.add(
				principal.multiply(interest)
				.multiply(new BigDecimal(noOfYears))
				);
		
		
		return totalValue;
	}


}
