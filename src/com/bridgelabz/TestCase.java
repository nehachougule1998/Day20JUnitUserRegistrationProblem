package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase {

UserRegistration ur = new UserRegistration();
	
	@Test
	void testFirstName() {
		assertTrue(ur.firstName("Neha"));
	}
	
	@Test
	void testLastName() {
		assertTrue(ur.lastName("Chougule"));
	}
	
	@Test
	void testEmailID() {
		assertTrue(ur.emailId("xyz.neha@bl.co"));
	}
	
	@Test
	void testMobileNumber() {
		assertTrue(ur.mobileNumber("91 9764485972"));
	}
	
	@Test
	void testPassword() {
		assertTrue(ur.password("Neha@67"));
	}

}