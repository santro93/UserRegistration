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

	public void validEmail() {
		System.out.print("Enter email Id : ");
		String email = scanner.next();
		System.out.println(Pattern.matches("^(abc)[.]{1}[A-Za-z]*[@]{1}(bl.co)(.in)*$", email));
	}

	public void validPhoneNumber() {
		System.out.print("Enter phone number : ");
		String phone = scanner.next();
		System.out.println(Pattern.matches("(0|91)?[7-9][0-9]{9}", phone));
	}

	public void validPassword() {
		System.out.print("Enter password : ");
		String password = scanner.next();
		System.out.println(Pattern.matches("^[A-Za-z0-9].{8,}$", password));
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problem!");
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.validFirstName();
		userRegistration.validLastName();
		userRegistration.validEmail();
		userRegistration.validPhoneNumber();
	}
}
