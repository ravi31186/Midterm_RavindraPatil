package com.rp.midterm;

public class Driver {

	public static void main(String[] args) {
				
		HourlyApplicant ha1 = new HourlyApplicant("Ravi", "Patil", "123456789", 10.75, 40);
		HourlyApplicant ha2 = new HourlyApplicant("John", "Doe", "5647463843", 15.75, 35);
		HourlyApplicant ha3 = new HourlyApplicant("Micheal", "Jackson", "984983943", 19, 25);
		
		CommissionApplicant ca1 = new CommissionApplicant("David", "Warner", "3646347722", 5000, 2);
		CommissionApplicant ca2 = new CommissionApplicant("Mike", "Hussey", "4628362833", 19000, 4.5);
		CommissionApplicant ca3 = new CommissionApplicant("Karan", "Sharma", "475483285", 7000, 9.9);

		System.out.println(ha1);
		System.out.println("====================");
		
		System.out.println(ha2);
		System.out.println("====================");
		
		System.out.println(ha3);
		System.out.println("====================");
		
		System.out.println(ca1);
		System.out.println("====================");

		System.out.println(ca2);
		System.out.println("====================");

		System.out.println(ca3);

	}

}
