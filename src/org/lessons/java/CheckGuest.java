package org.lessons.java;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		String[] invitedPeople = {
				"Dua Lipa", 
				"Paris Hilton", 
				"Manuel Agnelli", 
				"J-Ax", 
				"Francesco Totti", 
				"Ilary Blasi", 
				"Bebe Vio", 
				"Luis", 
				"Pardis Zarei", 
				"Martina Maccherone", 
				"Rachel Zeilic"
		};
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Please, insert your invitation name to check if you are in the list");
		
		String userName = sc.next();
				
		boolean isInTheList = false;
		
		for (int i = 0; i < invitedPeople.length; i++) {
			if (invitedPeople[i] == userName) {
				isInTheList = true;
			}
		}
		
		if (isInTheList) {
			System.out.println("Welcome! Your name is in the list. Please, come in!");
		} else {
			System.out.println("I'm sorry, your name is not in the list. You can't get in.");
		}
		
		sc.close();
	}
}
