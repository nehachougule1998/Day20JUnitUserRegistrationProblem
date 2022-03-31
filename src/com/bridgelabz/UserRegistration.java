package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	

	public static boolean firstName(String name) {
		String Firstname = "[A-Z]{1}[a-z]{3}";
		if(name.matches(Firstname)) {
			return true;
		}
		return false;
			
	}
	public static boolean lastName(String lastName) {
		String Lastname = "[A-Z]{1}[a-z]{3}";
		if(lastName.matches(Lastname)) {
			return true;
		}
		return false;
		
	}

	public static boolean emailId(String emailId) {
		String Emailid = "[abc](.+){1}[A-Za-z]*+@{1}[bl](.+)[co](.+)[in]$";
		if(emailId.matches(Emailid)) {
			return true;
		}
		return false;
	}
	public static boolean mobileNumber(String mobileNumber) {
		String Mobilenumber = "^(91)\\s{1}[7-9]{1}[0-9]{9}$";
		if(Mobilenumber.matches(Mobilenumber)) {
			return true;
		}
		return false;
	}

	public static boolean password(String password) {
		String pattern = "(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{8,}";
		if(password.matches(pattern)) {
			return true;
		}
		return false;
	}


}



