package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserRegistration {
	private static final String NAME = "^[A-Z]{1}[a-z]{2,}$";
	private static final String EMAIL = "^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$";
	private static final String PHONE_NUMBER = "^(91)[\\s]{1}[1-9]{1}[0-9]{9}$";
	private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$";

	public boolean validFirstName(String firstName) {
		return Pattern.matches(NAME, firstName);
	}

	public boolean validLastName(String lastName) {
		return Pattern.matches(NAME, lastName);
	}

	public static String validEmail(String emailId) {
		String emailPattern = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]*{2}$";
		Pattern pattern = Pattern.compile(emailId);
		if (emailId.matches(emailPattern)) { // check Input and Pattern
			return "Happy";
		} else {
			return "Sad";
		}
	}

	public boolean validPhoneNumber(String phoneNumber) {
		return Pattern.matches(PHONE_NUMBER, phoneNumber);
	}

	public boolean validPassword(String password) {
		return Pattern.matches(PASSWORD, password);
	}
}