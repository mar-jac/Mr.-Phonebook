/*
 ****************************************************************************************************
 *                                                                          				 mar-jac*
 *                                                                                                  *
 *                                                                                                  *
 ****************************************************************************************************
 */

package phonebook;

public class Customer {

    //create private variables of first name, last name, and phonenumber for Customer object
    private String firstName;
    private String lastName;
    private String phoneNumber;


    //declares Customer object
    public Customer(String fName, String lName, String phoneNumber) {
        this.firstName = fName;
        this.lastName = lName;
        this.phoneNumber = phoneNumber;
    }

    //getter for first name
    public String getfName() {
        return firstName;
    }

    //setter for first name
    public void setfName(String fName) {
        this.firstName = fName;
    }

    //getter for last name
    public String getlName() {
        return lastName;
    }

    //setter for last name
    public void setlName(String lName) {
        this.lastName = lName;
    }

    //getter for phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //setter for phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //this method displays the customer object information
    public void displayContact() {
        System.out.println("Name: " + firstName + " " + lastName + "\n Number: " + phoneNumber);
    }
}