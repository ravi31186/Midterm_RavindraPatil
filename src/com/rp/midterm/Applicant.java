package com.rp.midterm;

public abstract class Applicant {
	
	private String firstName;
	private String lastName;
	private String socialNumber;
	
	public abstract double earnigs();
	
	public Applicant(String firstName, String lastName, String socialNumber) {
		
		// Validate first, last Name and social Number.
		if (firstName.isEmpty() || lastName.isEmpty() || socialNumber.isEmpty()) {
			throw new IllegalArgumentException("firstName, lastName, socialNumber must not be empty.");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialNumber = socialNumber;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	

	public String getSocialNumber() {
		return socialNumber;
	}	

}
