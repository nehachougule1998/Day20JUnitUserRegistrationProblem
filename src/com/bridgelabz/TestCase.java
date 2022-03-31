package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase {
	UserRegistration ur = new UserRegistration();
	@Test
	void testFirstname() {
		assertTrue(ur.firstName("Neha"));
	}
	
	@Test
	void testLastname() {
		assertTrue(ur.lastName("Chougule"));
	}
	@Test
	void testEmailid() {
		assertTrue(ur.emailId("abc.neha@bl.co"));
	}
	@Test
	void testMobilenumber() {
		assertTrue(ur.mobileNumber("91 9623453617"));
	}
	@Test
	void testPassword() {
		assertTrue(ur.password("neha@12"));
	}
}
