import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class ContactView {
    ContactManagement contactManagement = new ContactManagement();
    Scanner scanner = new Scanner(System.in);
    List<Contacts> contactsList = contactManagement.showListContacts();


    public void formShowListContacts() {
        System.out.println("List of Contacts: " + contactsList);
        System.out.println("Enter Quit to back to Menu");
        String quit = scanner.next();
        if (quit.equalsIgnoreCase("quit")) {
            new Main();
        }
    }

    public void formDetailContacts() {
        System.out.println("Enter id to see.");
        int id = scanner.nextInt();
        System.out.println(contactManagement.detailContacts(id));
        System.out.println("Enter any key to continue detail - Enter quit to back MENU");
        String quit = scanner.next();
        if (quit.equalsIgnoreCase("quit")) {
            new Main();
        }
    }

    public void formCreatAContact() {
        boolean checkCreate = true;
        while (checkCreate) {
            int id = contactsList.size() + 1;
            System.out.println("Enter phone number: ");
            String phoneNb = scanner.next();
            System.out.println("Enter group of contact: ");
            String groupOfContact = scanner.nextLine();
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Choose Sex: Male or Female.). ");
            String sex = scanner.nextLine();
            System.out.println("Enter Date of Birth: ");
            String dob = scanner.nextLine();
            System.out.println("Enter Email: ");
            String email = scanner.nextLine();
            Contacts newContact = new Contacts(phoneNb, groupOfContact, name, sex, dob, email);
            contactManagement.creatContact(newContact);
            System.out.println("Create success! Enter any key to continue create - Enter quit to back MENU");
            String quit = scanner.next();
            if (quit.equalsIgnoreCase("quit")) {
                new Main();
            }


        }

    }

    public void formDeleteContact(){
        System.out.println("Enter id to delete Contact: ");
        int id = scanner.nextInt();
        contactManagement.deleteContact(id);
        System.out.println("Delete success! Enter any key to continue delete - Enter quit to back MENU");
        String quit = scanner.next();
        if(quit.equalsIgnoreCase("quit")){
            new Main();
        }
    }


    public void formEditStudent () {
        System.out.println("Enter id to edit student: ");
        int id = scanner.nextInt();
        Contacts contacts = contactManagement.detailContacts(id);
        System.out.println("Old contact --> "+contacts);
        System.out.println("Edit a new contact: ");
        System.out.println("Enter new phone number: ");
        String phoneNb = scanner.next();
        System.out.println("Enter new group of contact: ");
        String groupOfContact = scanner.nextLine();
        System.out.println("Enter new group of name: ");
        String name = scanner.nextLine();
        System.out.println("Choose new Sex: Male or Female.). ");
        String sex = scanner.nextLine();
        System.out.println("Enter new Date of Birth: ");
        String dob = scanner.nextLine();
        System.out.println("Enter new Email: ");
        String email = scanner.nextLine();
        Contacts newContact = new Contacts(id,phoneNb, groupOfContact, name, sex, dob, email);
        contactManagement.creatContact(newContact);
        System.out.println("Enter any key to continue edit - Enter quit to back MENU");
        String quit = scanner.next();
        if(quit.equalsIgnoreCase("quit")){
            new Main();
        }


//        String phoneNb;
//        String groupOfContact;
//        String name;
//        String sex;
//        String address;
//        String dob;
//        String email;

    }
}



