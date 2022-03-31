package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter your last name :");
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		
		System.out.println("first name is : " +firstName);
		System.out.println("first name is valid ? " + firstName(firstName));
		
		System.out.println("last name is : " +lastName);
		System.out.println("last name is valid ? " + lastName(lastName));
		
	}
	
	private static boolean firstName(String firstName) {
		
		return firstName.matches("[A-Z]{1}[a-z]{3}");	
	}
	
	private static boolean lastName(String lastName) {
		
		return lastName.matches("[A-Z]{1}[a-z]{3}");
	}

}

