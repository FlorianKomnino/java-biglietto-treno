package org.lessons.java;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] favFoods = {"Steak", "Hamburger and fries", "Pizza", "Carbonara", "Tiramisu", "Bacon and eggs", "Lemon pie"};
		
		System.out.println(favFoods.length);
		System.out.println("My favorite food is : " + favFoods[0]);
		System.out.println("My least favorite food is : " + favFoods[favFoods.length - 1]);
		if (favFoods.length % 2 == 0) {
			System.out.println("My middle favorite food is : " + favFoods[favFoods.length / 2]);
		} else {
			System.out.println("My middle favorite food is : " + favFoods[(favFoods.length - 1) / 2]);
		}
	}
}
