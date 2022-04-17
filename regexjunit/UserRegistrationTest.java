package com.bridgelabz.regexjunit;

import org.junit.Assert;
import org.junit.Test;
import com.bridgelabz.regex.UserRegistration;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_whenProper_ShouldReturnTrue() {
		boolean result = userRegistration.validFirstName("Akshara");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstName_whenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.validFirstName("aks");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_whenProper_ShouldReturnTrue() {
		boolean result = userRegistration.validLastName("Phalake");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_whenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.validLastName("phALKE");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmail_whenProper_ShouldReturnTrue() {
		boolean result = userRegistration.validEmail("abc.xyz@bl.co.in");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_whenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.validEmail("abc.xyz@bl.in");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPhone_whenProper_ShouldReturnTrue() {
		boolean result = userRegistration.validPhoneNumber("91 9922874588");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPhone_whenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.validPhoneNumber("919832373");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_whenProper_ShouldReturnTrue() {
		boolean result = userRegistration.validPassword("Aks@12345");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_whenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.validPassword("KiHoh23#%");
		Assert.assertFalse(result);
	}
}