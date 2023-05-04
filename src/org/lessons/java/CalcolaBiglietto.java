package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		float pricePerKm = 0.21f;
		System.out.println(pricePerKm);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please type the length of your trip in kilometers");
		
		String tripLength;
		tripLength = in.nextLine();
		Integer tripLengthInNumber = Integer.valueOf(tripLength);
		
		System.out.println("Please type your age");
		
		String userAge;
		userAge = in.nextLine();
		Integer userAgeInNumber = Integer.valueOf(userAge);
		
		if (userAgeInNumber > 65) {
			float tripPrice = (tripLengthInNumber * pricePerKm) / 100 * 60;
			System.out.println("Your ticket price is : " + tripPrice);
		} else if (userAgeInNumber < 18) {
			float tripPrice = (tripLengthInNumber * pricePerKm) / 100 * 80;
			System.out.println("Your ticket price is : " + tripPrice);
		} else {
			float tripPrice = tripLengthInNumber * pricePerKm;
			System.out.println("Your ticket price is : " + tripPrice);
		}
		
		in.close();
	}
}
