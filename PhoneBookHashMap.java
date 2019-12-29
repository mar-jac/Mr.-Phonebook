/*
 ****************************************************************************************************
 *                                                                          				 mar-jac*
 *                                                                                                  *
 *                                                                                                  *
 ****************************************************************************************************
 */


package phonebook;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBookHashMap {

    //create Hashmap instance for Customer name and number, as well as total phonebook contacts
    private static long count = 0;
    private Map<String, Customer> nameMap;
    private Map<String, Customer> numberMap;

    public PhoneBookHashMap() {

        //both using String and Customer object to set key
        nameMap = new HashMap<String, Customer>();
        numberMap = new HashMap<String, Customer>();
        initializePhonebook();
    }

    //getter method for count
    public static long getCount() {
        return count;
    }

    //private method to increase count within HashMap
    private static void increaseCount() {
        PhoneBookHashMap.count++;
    }

    //private method for constructor to have initial contacts in phonebook
    private void initializePhonebook() {
        ArrayList<Customer> custList = new ArrayList<>();
        custList.add(new Customer("Goku","Son", "62153852"));
        custList.add(new Customer("Midoriya", "Izuku", "74005925"));
        custList.add(new Customer("Rem", "IsBestGirl", "9363530"));
        custList.add(new Customer("C.", "C.", "10004896"));
        for(Customer customer: custList) {
            //looks for name as key to find customer from custList, ignoring case
            nameMap.put(customer.getfName().toLowerCase() + " " + customer.getlName().toLowerCase(), customer);
            numberMap.put(customer.getPhoneNumber(), customer);
            //looks for number as key to find customer from custList, ignoring case
            increaseCount(); // activates increase count method
        }
    }

    //adds customer to phonebook arrayList
    public void addCustomer(String fName, String lName, String phoneNumber) {
        if (nameMap.containsKey(fName.toLowerCase() + " " + lName.toLowerCase()) || numberMap.containsKey(phoneNumber)) {
            System.out.println("The contact already exists.");
            return; //only if name / number matches key, it is already is in phonebook
        }
        //adds name and phone to registry if HashMap key instance for name and numbers do not exist
        Customer customer = new Customer(fName, lName, phoneNumber);
        nameMap.put(fName.toLowerCase() + " " + lName.toLowerCase(), customer);
        numberMap.put(phoneNumber, customer);
        increaseCount();
        System.out.println();
        System.out.println("Contact successfully added. \n");
    }

        //sees if HashMap instance matches name key
    public void lookup(String fName, String lName) {
        if (nameMap.containsKey(fName.toLowerCase() + " " + lName.toLowerCase())) {
            nameMap.get(fName.toLowerCase() + " " + lName.toLowerCase()).displayContact();
            System.out.println();
        }
        else {
            System.out.println("This contact is unlisted. Null.");
            System.out.println();

        }
    }

    //sees if HashMap instance matches numberMap key
    public void reverseLookup(String phoneNumber) {
        if (numberMap.containsKey(phoneNumber)) {
            numberMap.get(phoneNumber).displayContact();
            System.out.println();
        }
        else {
            System.out.println("This contact is unlisted. Null.");
            System.out.println();


        }
    }

    //displays all contacts in the phonebook
    public void showAll() {
        for (Map.Entry<String, Customer> entry : nameMap.entrySet()) {
            entry.getValue().displayContact();
            System.out.println();
        }
        System.out.println("There are "  + count + " contacts.");
        System.out.println();
    }
}
