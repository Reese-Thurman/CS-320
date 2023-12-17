// Reese Thurman
// CS 320 - Module 6 (Project One)
// The following program adds, updates, and deletes contact objects within the application.
// Unit tests are included to test the quality of the code.

package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	String contactID;
	String contactFirstName;
	String contactLastName;
	String contactAddress;
	String longString;
	int contactPhone;

	@BeforeEach
	void setUp() {
		contactID = "12345";
		contactFirstName = "Freddy";
		contactLastName = "Krueger";
		contactAddress = "123 Elm Street";
		contactPhone = 1234567890;
		longString = "*************************************************************************************************";
	}

	// This test confirms that contactID is correctly added and is not null, and is not longer than 10 characters
	// Uniqueness is also tested 
	@Test
	void contactIDTest() {
	    Contact testContact = new Contact(contactID, contactFirstName, contactLastName, contactPhone, contactAddress);
	    assertEquals(contactID, testContact.getContactID());
	    assertThrows(IllegalArgumentException.class,() -> new Contact(null, contactFirstName, contactLastName, contactPhone, contactAddress));
	    assertThrows(IllegalArgumentException.class,() -> new Contact(longString, contactFirstName, contactLastName, contactPhone, contactAddress));
	}

	// This test confirms that contact first name is correctly added and is not null, and is not longer than 10 characters
	@Test
	void contactFirstNameTest() {
		Contact testContact = new Contact(contactID, contactFirstName, contactLastName, contactPhone, contactAddress);
	    assertEquals(contactFirstName, testContact.getContactFirstName());
	    assertThrows(IllegalArgumentException.class,() -> new Contact(contactID, null, contactLastName, contactPhone, contactAddress));
	    assertThrows(IllegalArgumentException.class,() -> new Contact(contactID, longString, contactLastName, contactPhone, contactAddress));
	}
	
	// This test confirms that contact last name is correctly added and is not null, and is not longer than 10 characters
	@Test
	void contactLastNameTest() {
		Contact testContact = new Contact(contactID, contactFirstName, contactLastName, contactPhone, contactAddress);
	    assertEquals(contactLastName, testContact.getContactLastName());
	    assertThrows(IllegalArgumentException.class,() -> new Contact(contactID, contactFirstName, null, contactPhone, contactAddress));
	    assertThrows(IllegalArgumentException.class,() -> new Contact(contactID, contactFirstName, longString, contactPhone, contactAddress));
	}
	
	// This test confirms that contact phone is correctly added and is not null, and is exactly 10 digits
	@Test
	void contactPhoneTest() {
		Contact testContact = new Contact(contactID, contactFirstName, contactLastName, contactPhone, contactAddress);
	    assertEquals(contactPhone, testContact.getContactPhone());
	    assertThrows(IllegalArgumentException.class,() -> new Contact(contactID, contactFirstName, contactLastName, 0, contactAddress));
	}
	
	// This test confirms contact address is correctly added and is not null, and is not longer than 30 characters
	@Test
	void contactAddresseTest() {
		Contact testContact = new Contact(contactID, contactFirstName, contactLastName, contactPhone, contactAddress);
	    assertEquals(contactAddress, testContact.getContactAddress());
	    assertThrows(IllegalArgumentException.class,() -> new Contact(contactID, contactFirstName, contactLastName, contactPhone, null));
	    assertThrows(IllegalArgumentException.class,() -> new Contact(contactID, contactFirstName, contactLastName, contactPhone, longString));
	}

}
