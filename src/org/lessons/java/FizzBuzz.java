package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		int totalNumbers;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please type the numbers you want to cycle with the FizzBuzz algorithm");
				
		totalNumbers = sc.nextInt();
		
		for (int i = 1 ; i < totalNumbers; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
		}
		
		sc.close();	
	}
}
