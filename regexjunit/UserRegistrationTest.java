package com.bridgelabz.regexjunit;

import org.junit.Assert;
import org.junit.Test;
import com.bridgelabz.regex.UserRegistration;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_whenProper_ShouldReturnTrue() {
		boolean result = userRegistration.validFirstName("Santosh");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstName_whenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.validFirstName("san");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_whenProper_ShouldReturnTrue() {
		boolean result = userRegistration.validLastName("Nagargoje");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_whenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.validLastName("nagaRgoje");
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
		boolean result = userRegistration.validPassword("Pqr@12345");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_whenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.validPassword("asdfg@#$%");
		Assert.assertFalse(result);
	}
}