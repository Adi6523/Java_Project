package com.sunbeam.quiz.menu;

import java.util.*;

public class SignUpMenu {
	private static int signUpMenuOptions(Scanner sc) {
		System.out.println("***********Sign-UP Menu***********");
		System.out.println("0.SIGNOUT");
		System.out.println("1.AS Creator/Teacher");
		System.out.println("2.AS Student");
		System.out.println("3.AS Admin");
		System.out.println("Enter your choice - ");
		return sc.nextInt();
	}

	public static void signUpMenu(Scanner sc) {
		int choice;
		while ((choice = signUpMenuOptions(sc)) != 0) {
			switch (choice) {
			case 1:
				System.out.println(" You Have Selected SignUP AS Creator/Teacher Option");
				break;
			case 2:
				System.out.println(" You Have Selected SignUP AS Student Option");
				break;
			case 3:
				System.out.println(" You Have Selected SignUP AS Admin Option");
				break;

			default:
				System.out.println("The choice Enter is Wrong ...");
				break;
			}
		}
	}
}
