package com.sunbeam.quiz.menu;

import java.util.Scanner;

enum EMainMenu{
	EXIT,SIGNIN,SIGNUP,ADMIN
}


public class MainMenu {
	
	public static void enumMainMenu(Scanner sc)
	{
		EMainMenu[] arr = EMainMenu.values();
		EMainMenu enumChoice;
		do{
			for (EMainMenu ele: arr)
			{
				System.out.println(ele.ordinal()+" . "+ele.name());
			}
			System.out.println("Enter Your Choice - ");
			int choice = sc.nextInt();
			enumChoice = arr[choice];
			switch (enumChoice) {
			case EXIT:
				System.out.println("Thank You For Using Application");
				break;
			case SIGNIN:
				System.out.println("You have selected the Signin Option");
				SignInMenu.signInMenu(sc);
				break;
			case SIGNUP:
				System.out.println("You have selected the Signup Option");
				SignUpMenu.signUpMenu(sc);
				break;
			case ADMIN:
				System.out.println("You have selected the Admin Option");
				AdminMenu.adminMenu(sc);
				break;

			default:
				System.out.println("Wrong Choice...");
				break;
			}
		}while(enumChoice!=EMainMenu.EXIT);
	}
	
	
	
	
	
	private static int mainMenuOptions(Scanner sc) {
		System.out.println("***********MainMenu***********");
		System.out.println("0.EXIT");
		System.out.println("1.SignIn");
		System.out.println("2.Signup");
		System.out.println("3.Admin");
		System.out.println("Enter your choice - ");
		return sc.nextInt();
	}

	public static void mainMenu(Scanner sc) {
		int choice;
		while ((choice = mainMenuOptions(sc)) != 0) {
			switch (choice) {
			case 1:
				System.out.println(" You Have Selected Sign IN Option");
				SignInMenu.signInMenu(sc);
				break;
			case 2:
				System.out.println(" You Have Selected Sign UP Option");
				SignUpMenu.signUpMenu(sc);
				break;
			case 3:
				System.out.println(" You Have Selected Admin Option");
				AdminMenu.adminMenu(sc);
				break;
			default:
				System.out.println("The choice Enter is Wrong ...");
				break;
			}
		}
	}
}
