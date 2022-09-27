package assignment.questionOne;

import java.util.HashMap;
import java.util.ArrayList;

public class MobileNumbers {
    
    HashMap<String, ArrayList<String>> contactDetails;

    public MobileNumbers() {
        this.contactDetails = new HashMap<String, ArrayList<String>>();
    }

    
    public HashMap<String, ArrayList<String>> getPhoneNumbers() {
        return contactDetails;
    }

    public void getContactDetails() {
        for (String key : contactDetails.keySet()) {
            System.out.printf("Name: %s , Phone Numbers: %s ", key, this.searchNames(key).toString()).println();
        }
    }

    public boolean addNewPhoneNumbers(String name, String phoneNumber) {

        if (contactDetails.containsKey(name)) {
            ArrayList<String> currentList = contactDetails.get(name);
            if (currentList.contains(phoneNumber)) {
                return false;
            }
           currentList.add(phoneNumber);
           contactDetails.put(name, currentList);
            return true;
        }

       ArrayList<String> newPhoneNumbers = new ArrayList<String>();
        newPhoneNumbers.add(phoneNumber);
        contactDetails.put(name, newPhoneNumbers);
        return true;
    }

    public ArrayList<String> searchPhoneNumbers(String name) {
        ArrayList<String> numbers = new ArrayList<String>();
        for (String key : contactDetails.keySet()) {
            if (key.toLowerCase().contains(name.toLowerCase())) {
                for (String phoneNumbers : contactDetails.get(key)) {
                    numbers.add(phoneNumbers);
                }
            }
        }
        if (numbers.isEmpty()) {
            return null;
        }
        return numbers;
   }

    public ArrayList<String> searchNames(String name) {
        ArrayList<String> names = new ArrayList<String>();
        for (String key : contactDetails.keySet()) {
            if (key.toLowerCase().contentEquals(name.toLowerCase())) {
                for (String phoneNumbers : contactDetails.get(key)) {
                    names.add(phoneNumbers);
                }
            }
        }
        if (names.isEmpty()) {
            return null;
        }
        return names;
    }


}
