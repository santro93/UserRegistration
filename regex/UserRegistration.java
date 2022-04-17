package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserRegistration {
	private static final String NAME = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL = "^(abc)[.0-9+-]*(@)[0-9a-z]{1,}(.com){1,}(.au)*$|^(abc)[0-9+-]*(@)[0-9a-z]{1,}(.net){1}$";
    private static final String PHONE_NUMBER = "^(91)[\\s]{1}[1-9]{1}[0-9]{9}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$";

    public boolean validFirstName(String firstName) {
            return Pattern.matches(NAME, firstName);
    }

    public boolean validLastName(String lastName) {
            return Pattern.matches(NAME, lastName);
    }

    public boolean validEmail(String email) {
            return Pattern.matches(EMAIL, email);
    }


    public boolean validPhoneNumber(String phoneNumber) {
            return Pattern.matches(PHONE_NUMBER, phoneNumber);
    }

    public boolean validPassword(String password) {
            return Pattern.matches(PASSWORD, password);
    }
}