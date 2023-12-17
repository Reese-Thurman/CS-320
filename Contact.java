//Reese Thurman
//CS 320 - Module 6 (Project One)
//The following program adds, updates, and deletes contact objects within the application.
//Unit tests are included to test the quality of the code.

package contact;

public class Contact {
	// Initialize variables
	String contactID = "";
	String contactFirstName = "";
	String contactLastName = "";
	String contactAddress = "";
	int contactPhone = 0;
	
	private static final int MAX_LENGTH_ID = 10;
	private static final int MAX_LENGTH_NAME = 10;
	private static final int MAX_LENGTH_PHONE = 10;
	private static final int MAX_LENGTH_ADDRESS = 30;

	// Constructor
	public Contact(String contactID, String contactFirstName, String contactLastName, int contactPhone, String contactAddress) {
	 	
	 	if (contactID != null && contactID.length() <= MAX_LENGTH_ID){
	 		this.contactID = contactID;
	 	}
	 	
	 	else
	 		throw new IllegalArgumentException("Invalid Contact ID");
	 	
	 	if (contactFirstName != null && contactFirstName.length() <= MAX_LENGTH_NAME){
	 		this.contactFirstName = contactFirstName;
	 	}
	 	
	 	else
	 		throw new IllegalArgumentException("Invalid Contact First Name");
	 	
	 	if (contactLastName != null && contactLastName.length() <= MAX_LENGTH_NAME){
	 		this.contactLastName = contactLastName;
	 	}
	 	
	 	else
	 		throw new IllegalArgumentException("Invalid Contact Last Name");
	 	
	 	if ((Integer.toString(contactPhone)).length() == MAX_LENGTH_PHONE){
	 		this.contactPhone = contactPhone;
	 	}
	 	
	 	else
	 		throw new IllegalArgumentException("Invalid Contact Phone Number");
	 	
	 	if (contactAddress != null && contactAddress.length() <= MAX_LENGTH_ADDRESS){
	 		this.contactAddress = contactAddress;
	 	}
	 	
	 	else
	 		throw new IllegalArgumentException("Invalid Contact Address");
 }
	
	// Updates the contact first name
	public void SetContactFirstName(String contactFirstName) {
	 	
	 	if (contactFirstName == null || contactFirstName.length() > MAX_LENGTH_NAME)
	 		throw new IllegalArgumentException("Invalid Contact First Name");
	 	
	 	else
	 		this.contactFirstName = contactFirstName; 	
 }
	
	// Updates the contact last name
	public void SetContactLastName(String contactLastName) {
	 	
	 	if (contactLastName == null || contactLastName.length() > MAX_LENGTH_NAME)
	 		throw new IllegalArgumentException("Invalid Contact Last Name");
	 	
	 	else
	 		this.contactLastName = contactLastName; 	
 }
	
	// Updates the contact phone
	public void SetContactPhone(int contactPhone) {
	 	
	 	if ((Integer.toString(contactPhone)).length() != MAX_LENGTH_PHONE)
	 		throw new IllegalArgumentException("Invalid Contact Phone Number");
	 	
	 	else
	 		this.contactPhone = contactPhone; 	
 }
	
	// Updates the contact address
	public void SetContactAddress(String contactAddress) {
	 	
	 	if (contactAddress == null || contactAddress.length() > MAX_LENGTH_ADDRESS)
	 		throw new IllegalArgumentException("Invalid Contact Address");
	 	
	 	else
	 		this.contactAddress = contactAddress; 	
 }
	
 
 // Getter for contactID
 public String getContactID() {
 	return contactID;
 }
 
 // Getter for contactFirstName
 public String getContactFirstName() {
 	return contactFirstName;
 }
 
 // Getter for contactLastname
 public String getContactLastName() {
 	return contactLastName;
 }
 
 // Getter for contactPhone
 public int getContactPhone() {
 	return contactPhone;
 }
 
 // Getter for contactAddress
 public String getContactAddress() {
 	return contactAddress;
 }
 
}
