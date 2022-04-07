package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);

	public void validFirstName() {
		System.out.println("Enter First name starts with Cap and has minimum 3 characters: ");
		String firstName = scanner.next();
		System.out.println(Pattern.matches("^[A-Z]{1}[A-Za-z]{2,}$", firstName));
	}
	
	public void validLastName() {
		System.out.println("Enter Last name starts with Cap and has minimum 3 characters: ");
		String lastName = scanner.next();
		System.out.println(Pattern.matches("^[A-Z]{1}[A-Za-z]{2,}$", lastName));
	}

	public static void main(String[] args) {
		System.out.println("Welcometo User Registration Problem!");
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.validFirstName();
		userRegistration.validLastName();
	}
}
