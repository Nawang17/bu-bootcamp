import java.util.*;

public class ContactManager {

    public static void main(String[] args) {

        HashMap<String, Contact> contacts = new HashMap<>();

        // Add contacts
        contacts.put("Ada Lovelace",
                new Contact("Ada Lovelace", "+1 617 555 0101"));

        contacts.put("Grace Hopper",
                new Contact("Grace Hopper", "+1 617 555 0102"));

        contacts.put("Alan Turing",
                new Contact("Alan Turing", "+1 617 555 0103"));

        contacts.put("Katherine Johnson",
                new Contact("Katherine Johnson", "+1 617 555 0104"));

        contacts.put("Tim Berners-Lee",
                new Contact("Tim Berners-Lee", "+1 617 555 0105"));


        // Look up a contact that exists
        Contact found = contacts.get("Ada Lovelace");

        System.out.println("=== Contact Lookup ===");

        if (found == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(found);
        }


        // Test a contact that does not exist
        Contact notFound = contacts.get("John Smith");

        if (notFound == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(notFound);
        }


        // Create and sort the list
        ArrayList<Contact> sorted =
                new ArrayList<>(contacts.values());

        sorted.sort((a, b) ->
                a.getName().compareTo(b.getName()));


        // Print all contacts
        System.out.println();
        System.out.println("=== All Contacts ===");

        for (Contact contact : sorted) {
            System.out.println(contact);
        }
    }
}