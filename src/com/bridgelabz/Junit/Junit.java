package com.bridgelabz.Junit;
import java.util.Scanner;
public class Junit {

	public static void main(String[] args) {
		Junit regex = new Junit();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name :");
		String firstName = scan.nextLine();
		System.out.println("Enter your last name :");
		String lastName = scan.nextLine();
		System.out.println("Enter your Email ID :");
		String emailId = scan.nextLine();
		System.out.println("Enter your Mobile Number:");
		String mobileNumber = scan.nextLine();
		System.out.println("Enter password:");
		String password = scan.nextLine();
		System.out.println("Enter Email");
		String email = scan.nextLine();
		
		System.out.println("first name is : " +firstName);
		System.out.println("first name is valid ? " + firstName(firstName));
		
		System.out.println("last name is : " +lastName);
		System.out.println("last name is valid ? " + lastName(lastName));
		
		System.out.println("Email ID is : " +emailId);
		System.out.println("Email ID valid ? " + emailId(emailId));
		
		System.out.println("Mobile No is : " +mobileNumber);
		System.out.println("Mobile No valid ? " + mobileNumber(mobileNumber));
		
		System.out.println("Password valid ? " + password(password));
		
		System.out.println(regex.validEmail(email));
		
	}
	
	public static boolean firstName(String firstName) {
		return firstName.matches("[A-Z]{1}[a-z]{3}");	
	}
	
	public static boolean lastName(String lastName) {
		return lastName.matches("[A-Z]{1}[a-z]{3}");
	}
	
	public static boolean emailId(String emailId) {
		return emailId.matches("[abc](.+){1}[A-Za-z]*+@{1}[bl](.+)[co](.+)[in]$");
	}
	
	public static boolean mobileNumber(String mobileNumber) {
		return mobileNumber.matches("^(91)\\s{1}[7-9]{1}[0-9]{9}$");
	}
	
	public static boolean password(String password) {
		String pattern = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])([#?!@$%^&*-]).{8,}$";
		if(password.matches(pattern)) {
			return true;
		}
		return false;
	}
	
	public static boolean validEmail(String email){
		return email.matches("^(abc)[0-9+-]*(@)[0-9a-z]{1,}(.com){1,}(.au)*$|^(abc)[0-9+-]*(@)[0-9a-z]{1,}(.net){1}$");
	}


}

