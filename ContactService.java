//Reese Thurman
//CS 320 - Module 6 (Project One)
//The following program adds, updates, and deletes contact objects within the application.
//Unit tests are included to test the quality of the code.

package contact;

import java.util.ArrayList;

public class ContactService {
	// Initialize variables
	ArrayList<Contact> contactList = new ArrayList<>();
	Contact contactObject;
	
	// Creates a contact object
	public Contact createContactObject(String contactID, String contactFirstName, String contactLastName, int contactPhone, String contactAddress) {
	
		return new Contact(contactID, contactFirstName, contactLastName, contactPhone, contactAddress);
	}
	
	public static void main(String[] args) {

	}
	
	// Adds a contact to the array list. contactID must be unique
	public void addContact(Contact contactObject) {
		boolean isDuplicate = false;
		
		for (Contact tTemp : contactList) {
			if (tTemp.getContactID() == contactObject.contactID) {
				isDuplicate = true;
				throw new IllegalArgumentException("Duplicate Contact ID");
			}
		}
		
		if (isDuplicate == false) {
			
			contactList.add(contactObject);
		}
	}
	
	// Deletes contact from the array list
	public void deleteContact(String contactID) {
		boolean isFound = false;
		for (Contact tTemp : contactList) {
         if (tTemp.getContactID() == contactID) {
         	contactList.remove(tTemp);
         	isFound = true;
         	break;
         }
		}  
		
		if (isFound == false)
			throw new IllegalArgumentException("Contact ID Not Found");
		
	}
	
	// Updates contact first name 
	public void updateContactFirstName(String contactID, String contactFirstName) {
		boolean isFound = false;
		int i = 0;
		for (Contact tTemp : contactList) {
			if (tTemp.getContactID() == contactID) {
				contactList.get(i).SetContactFirstName(contactFirstName);
				isFound = true;
			}
			i = i +1;
		}
		
		if (isFound == false)
			throw new IllegalArgumentException("Contact ID Not Found");
	}

	// Updates contact last name 
	public void updateContactLastName(String contactID, String contactLastName) {
		boolean isFound = false;
		int i = 0;
		for (Contact tTemp : contactList) {
			if (tTemp.getContactID() == contactID) {
				contactList.get(i).SetContactLastName(contactLastName);
				isFound = true;
			}
			i = i +1;
		}
		
		if (isFound == false)
			throw new IllegalArgumentException("Contact ID Not Found");
	}
	
	// Updates contact phone number 
	public void updateContactPhone(String contactID, int contactPhone) {
		boolean isFound = false;
		int i = 0;
		for (Contact tTemp : contactList) {
			if (tTemp.getContactID() == contactID) {
				contactList.get(i).SetContactPhone(contactPhone);
				isFound = true;
			}
			i = i +1;
		}
		
		if (isFound == false)
			throw new IllegalArgumentException("Contact ID Not Found");
	}
	
	// Updates contact address
	public void updateContactAddress(String contactID, String contactAddress) {
		boolean isFound = false;
		int i = 0;
		for (Contact tTemp : contactList) {
			if (tTemp.getContactID() == contactID) {
				contactList.get(i).SetContactAddress(contactAddress);
				isFound = true;
			}
			i = i + 1;
		} 
		
		if (isFound == false)
			throw new IllegalArgumentException("Contact ID Not Found");
	}	
}

