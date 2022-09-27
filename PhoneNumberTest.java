package assignment.questionOne;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneNumberTest {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        MobileNumbers contacts = new MobileNumbers();
        System.out.print("Please the number of contact details to save: ");
        int numberContacts = scanner.nextInt();

        // try {
        //     int numberContacts = scanner.nextInt();
        // } catch (InputMismatchException e) {
        //     scanner.next();      // to clear the current user input stream
        //     System.out.println("That isn't an integer");
        // }

        for (int i = 1; i <= numberContacts; i++) {
            System.out.println();
            System.out.print("Enter the name of contact: ");
            String name = scanner.next();
            System.out.print("Enter the phone number of contact:  ");
            String phoneNumber = scanner.next();
            contacts.addNewPhoneNumbers(name, phoneNumber);
            System.out.println();
        }

        contacts.getContactDetails();

        while (true) {
            System.out.print("Search for a certain contact or press enter to stop:");
            String search = scanner.next();
            if (search.length() < 0) {
                break;
            }
            ArrayList<String> result = contacts.searchPhoneNumbers(search);
            if (result == null || result.isEmpty()) {
                System.out.println("No result for search " + search);
                continue;
            }
            System.out.printf("Result for search \' %s \' = %s ", search, result.toString()).println();
        }
    }
}
