import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name : " + name +
                "\nPhone : " + phone +
                "\nEmail : " + email;
    }
}

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();
    HashMap<String, Contact> map = new HashMap<>();
    HashSet<String> phoneNumbers = new HashSet<>();

    // Add Contact
    public void addContact(String name, String phone, String email) {

        if (phoneNumbers.contains(phone)) {
            System.out.println("Phone number already exists!");
            return;
        }

        Contact c = new Contact(name, phone, email);

        contacts.add(c);
        map.put(name, c);
        phoneNumbers.add(phone);

        System.out.println("Contact Added Successfully!");
    }

    // Search Contact
    public void searchContact(String name) {

        Contact c = map.get(name);

        if (c != null)
            System.out.println(c);
        else
            System.out.println("Contact not found!");
    }

    // Delete Contact
    public void deleteContact(String name) {

        Contact c = map.remove(name);

        if (c != null) {
            contacts.remove(c);
            phoneNumbers.remove(c.phone);
            System.out.println("Contact Deleted!");
        } else {
            System.out.println("Contact not found!");
        }
    }

    // Display Contacts Sorted by Name
    public void displayContacts() {

        Collections.sort(contacts, (a, b) -> a.name.compareTo(b.name));

        System.out.println("\nAddress Book");

        for (Contact c : contacts) {
            System.out.println(c);
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        book.addContact("Tarun", "9876543210", "tarun@gmail.com");
        book.addContact("Aman", "9876543200", "aman@gmail.com");
        book.addContact("Rohit", "9876543222", "rohit@gmail.com");

        // Duplicate Phone
        book.addContact("Ajay", "9876543210", "ajay@gmail.com");

        System.out.println("\nSearch Contact:");
        book.searchContact("Aman");

        System.out.println("\nDelete Contact:");
        book.deleteContact("Rohit");

        System.out.println();
        book.displayContacts();
    }
}