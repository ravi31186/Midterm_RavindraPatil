package com.rp.midterm;

public class HourlyApplicant extends Applicant {
	
	private double wage;
	private double hours; 
	
	public HourlyApplicant(String firstName, String lastName, String socialNumber, double wage, double hours) {
		super(firstName, lastName, socialNumber);
		
		// Validate wage and hours.
		if (wage <= 0 || hours < 0) {
			throw new IllegalArgumentException("Enter Wage more than zero and hours more or equal to zero");
		}

		this.wage = wage;
		this.hours = hours;
	}
	
	//calculate earnings for hourly applicant
	@Override
	public double earnigs() {
		return wage * hours;
		
	}

	public double getWage() {
		return wage;
	}


	public void setWage(double wage) {
		this.wage = wage;
	}


	public double getHours() {
		return hours;
	}


	public void setHours(double hours) {
		this.hours = hours;
	}
	
	@Override
	public String toString() {
		return "HourlyApplicant [ wage=" + wage + ", hours=" + hours + ", earnigs()=" + earnigs() + 
				" getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + 
				", getSocialNumber()=" + getSocialNumber();
	}

}
