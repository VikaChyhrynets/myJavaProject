package school.lesson8;

import java.util.HashMap;
import java.util.HashSet;

public class Contacts {

    private HashMap<String, HashSet<String>> contacts;

    public Contacts() {
        this.contacts = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            HashSet<String> currentNumbers = contacts.get(name);
            currentNumbers.add(phoneNumber);
            contacts.put(name, currentNumbers);
        } else {
            HashSet<String> newNumber = new HashSet<>();
            newNumber.add(phoneNumber);
            contacts.put(name, newNumber);
        }
    }

    public HashSet<String> get(String name) {
        return contacts.get(name);
    }

}
