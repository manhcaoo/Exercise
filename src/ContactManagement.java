import java.util.List;

public class ContactManagement {
    IContactService contactService = new ContactService();

    public void creatContact (Contacts contacts){
        contactService.save(contacts);
    }

    public List<Contacts> showListContacts(){
        return contactService.findAll();
    }

    public void deleteContact(int id){
        contactService.deleteById(id);
    }

    public Contacts detailContacts(int id){
        return contactService.findById(id);

    }

    public void editContacts(int id, Contacts contacts){
        Contacts contacts1 = contactService.findById(id);
        contacts1.setId(id);
        contacts1.setPhoneNb(contacts.phoneNb);
        contacts1.setGroupOfContact(contacts.groupOfContact);
        contacts1.setName(contacts.name);
        contacts1.setSex(contacts.sex);

        contacts1.setAddress(contacts.address);
        contacts1.setDob(contacts.dob);
        contacts1.setEmail(contacts.email);
        contactService.deleteById(id);
        contactService.save(contacts1);






    }

}
