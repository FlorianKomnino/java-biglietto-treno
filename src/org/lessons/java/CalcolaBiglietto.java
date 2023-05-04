package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please type the length of your trip in kilometers");
		
		int tripLength = in.nextInt();
		
		System.out.println("Please type your age");
		
		int userAge = in.nextInt();
		
		int totPrice = tripLength * 21;
		
		if (userAge > 65) {
			totPrice = totPrice / 100 * 60;
			
			float finalPrice = totPrice / 100f;
			System.out.println(
					"final price: " 
					+ String.format("%.2f", finalPrice)
					+ "E"
				);
		} else if (userAge < 18) {
			totPrice = totPrice / 100 * 80;
			
			float finalPrice = totPrice / 100f;
			System.out.println(
					"final price: " 
					+ String.format("%.2f", finalPrice)
					+ "E"
				);
		} else {
			float finalPrice = totPrice / 100f;
			System.out.println(
					"final price: " 
					+ String.format("%.2f", finalPrice)
					+ "E"
				);
		}

		in.close();	
		
	}
}
