// Reese Thurman
// CS 320 - Module 6 (Project One)
// The following program adds, updates, and deletes contact objects within the application.
// Unit tests are included to test the quality of the code.

package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	String contactID;
	String contactFirstName;
	String updatedFirstName;
	String contactLastName;
	String updatedLastName;
	String contactAddress;
	String updatedAddress;
	String longString;
	int contactPhone;
	int updatedPhone;

	@BeforeEach
	void setUp() {
		contactID = "12345";
		contactFirstName = "Freddy";
		updatedFirstName = "Jason";
		contactLastName = "Krueger";
		updatedLastName = "Voorhees";
		contactAddress = "123 Elm Street";
		updatedAddress = "123 Palm Street";
		contactPhone = 1234567890;
		updatedPhone = 1876543210;
		longString = "*************************************************************************************************";
	}

	    // This test confirms that contactID is correctly added with a unique ID
		@Test
		void addContactIDTest() {
		    ContactService testContactService = new ContactService();
		    testContactService.addContact(testContactService.createContactObject(contactID, contactFirstName, contactLastName, contactPhone, contactAddress));
		    assertEquals(contactID, testContactService.contactList.get(0).getContactID());
		    assertThrows(IllegalArgumentException.class,() -> testContactService.addContact(testContactService.createContactObject(contactID, contactFirstName, contactLastName, contactPhone, contactAddress)));
		}
		
		// This test confirms that the contact is correctly deleted
		@Test
		void deleteContactIDTest() {
			ContactService testContactService = new ContactService();
		    testContactService.addContact(testContactService.createContactObject(contactID, contactFirstName, contactLastName, contactPhone, contactAddress));
		    testContactService.deleteContact(contactID);
		    assertThrows(IllegalArgumentException.class,() -> testContactService.deleteContact(contactID));
		}
		
		// This test confirms that the contact first name is correctly updated
		@Test
		void updateContactFirstNameTest() {
			ContactService testContactService = new ContactService();
		    testContactService.addContact(testContactService.createContactObject(contactID, contactFirstName, contactLastName, contactPhone, contactAddress));
		    testContactService.updateContactFirstName(contactID, updatedFirstName);
		    assertEquals(updatedFirstName, testContactService.contactList.get(0).getContactFirstName());
		    assertThrows(IllegalArgumentException.class,() -> testContactService.updateContactFirstName(contactID, longString));
		    assertThrows(IllegalArgumentException.class,() -> testContactService.updateContactFirstName(contactID, null));
		}
		
		// This test confirms that the contact last name is correctly updated
		@Test
		void updateContactLastNameTest() {
			ContactService testContactService = new ContactService();
		    testContactService.addContact(testContactService.createContactObject(contactID, contactFirstName, contactLastName, contactPhone, contactAddress));
		    testContactService.updateContactLastName(contactID, updatedLastName);
		    assertEquals(updatedLastName, testContactService.contactList.get(0).getContactLastName());
		    assertThrows(IllegalArgumentException.class,() -> testContactService.updateContactLastName(contactID, longString));
		    assertThrows(IllegalArgumentException.class,() -> testContactService.updateContactLastName(contactID, null));
		}
		
		// This test confirms that the contact phone is correctly updated
		@Test
		void updateContactPhoneTest() {
			ContactService testContactService = new ContactService();
		    testContactService.addContact(testContactService.createContactObject(contactID, contactFirstName, contactLastName, contactPhone, contactAddress));
		    testContactService.updateContactPhone(contactID, updatedPhone);
		    assertEquals(updatedPhone, testContactService.contactList.get(0).getContactPhone());
		    assertThrows(IllegalArgumentException.class,() -> testContactService.updateContactPhone(contactID, 0));
		}

		// This test confirms that the contact address is correctly updated
		@Test
		void updateContactAddressTest() {
			ContactService testContactService = new ContactService();
		    testContactService.addContact(testContactService.createContactObject(contactID, contactFirstName, contactLastName, contactPhone, contactAddress));
		    testContactService.updateContactAddress(contactID, updatedAddress);
		    assertEquals(updatedAddress, testContactService.contactList.get(0).getContactAddress());
		    assertThrows(IllegalArgumentException.class,() -> testContactService.updateContactAddress(contactID, longString));
		    assertThrows(IllegalArgumentException.class,() -> testContactService.updateContactAddress(contactID, null));
		}
		
}
