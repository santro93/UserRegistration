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

	public void validPhoneNumber() {
		System.out.print("Enter phone number : ");
		String phone = scanner.next();
		System.out.println(Pattern.matches("(0|91)?[7-9][0-9]{9}", phone));
	}

	public void validPassword() {
		System.out.print("Enter password : ");
		String password = scanner.next();
		System.out.println(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$", password));
	}

	public void validEmail(String[] email) {
		for (int i = 0; i < email.length; i++) {
			System.out.print(Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email[i]) + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problem!");

		String[] validEmailSample = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        String[] invalidEmailSample = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

		UserRegistration userRegistration = new UserRegistration();
		userRegistration.validFirstName();
		userRegistration.validLastName();
		userRegistration.validPhoneNumber();
		userRegistration.validPassword();
		System.out.println("Valid email :");
		userRegistration.validEmail(validEmailSample);
		System.out.println("\nInvalid emails :");
		userRegistration.validEmail(invalidEmailSample);
	}
}
