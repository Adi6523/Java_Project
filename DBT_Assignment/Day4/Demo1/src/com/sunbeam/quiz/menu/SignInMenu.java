package com.sunbeam.quiz.menu;

import java.util.*;

public class SignInMenu {
	private static int signInMenuOptions(Scanner sc) {
		System.out.println("***********Sign-In Menu***********");
		System.out.println("0.SIGNOUT");
		System.out.println("1.Attempt Quiz");
		System.out.println("2.Display Marks");
		System.out.println("3.Display Profile");
		System.out.println("4.Update Mobile");
		System.out.println("Enter your choice - ");
		return sc.nextInt();
	}

	public static void signInMenu(Scanner sc) {
		int choice;
		while ((choice = signInMenuOptions(sc)) != 0) {
			switch (choice) {
			case 1:
				System.out.println(" You Have Selected Attempt Quiz Option");
				break;
			case 2:
				System.out.println(" You Have Selected Display Marks Option");
				break;
			case 3:
				System.out.println(" You Have Selected Display Profile Option");
				break;
			case 4:
				System.out.println(" You Have Selected Update Mobile Option");
				break;
			default:
				System.out.println("The choice Enter is Wrong ...");
				break;
			}
		}
	}
}
