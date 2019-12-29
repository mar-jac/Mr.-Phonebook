/*
 ****************************************************************************************************
 *                                                                          				 mar-jac*
 *                                                                                                  *
 *                                                                                                  *
 ****************************************************************************************************
 */



package phonebook;

import java.util.Scanner;

public class Phone {

    public static void main(String args[]) {

        PhoneBookHashMap phoneBook = new PhoneBookHashMap();
        Scanner input = new Scanner(System.in);

        String firstName, lastName, phoneNumber;
        boolean valid = true;

        System.out.println("Welcome to the Ultimate Phonebook! Please enter the following " +
                "options below based on the number.\n");


        while (valid) {

            //Does different task for each number option

            System.out.println("1. Add Contact to Phonebook");
            System.out.println("2. Search Contact By Name");
            System.out.println("3. Search Contact By Phone Number");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit ");
            System.out.println();
            System.out.print("Please enter a choice to proceed: ");

            switch (input.nextInt()) {

                case 1:
                    System.out.print("Please enter the first name : ");
                    firstName = input.next();
                    System.out.print("Please enter the last name : ");
                    lastName = input.next();
                    System.out.print("Please enter the phone number : ");
                    phoneNumber = input.next();
                    phoneBook.addCustomer(firstName, lastName, phoneNumber);
                    break;

                case 2:
                    System.out.print("Please enter the first name : ");
                    firstName = input.next();
                    System.out.print("Please enter the last name : ");
                    lastName = input.next();
                    phoneBook.lookup(firstName, lastName);
                    break;

                case 3:
                    System.out.print("Enter Phone Number : ");
                    phoneNumber = input.next();
                    phoneBook.reverseLookup(phoneNumber);
                    break;

                case 4:
                    phoneBook.showAll();
                    break;

                case 5:
                    valid = false;
            }
        }
        input.close();
    }
}