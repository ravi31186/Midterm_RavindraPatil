package com.rp.midterm;

public class CommissionApplicant extends Applicant {
	
	private double grossSales;
	private double comissionRate;
	
	public CommissionApplicant(String firstName, String lastName, String socialNumber, double grossSales, double commisionRate) {
		super(firstName, lastName, socialNumber);
		
		// Validate grossSales and commisionRate
		if (grossSales < 0 || commisionRate <= 0) {
			throw new IllegalArgumentException("Enter GrossSales more than zero and commisionRate more or equal to zero");
		}
		
		this.grossSales = grossSales;
		this.comissionRate = commisionRate;
	}
	
	
	//calculate earnings for commission applicant
	@Override
	public double earnigs() {
		return grossSales * comissionRate;
	}


	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}


	public double getComissionRate() {
		return comissionRate;
	}


	public void setComissionRate(double comissionRate) {
		this.comissionRate = comissionRate;
	}
	
	@Override
	public String toString() {
		return "CommissionApplicant [ grossSales=" + grossSales + ", comissionRate=" + comissionRate + ", earnigs()=" + earnigs() + 
				", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getSocialNumber()=" + getSocialNumber();
	}
	

}
