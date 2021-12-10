import java.util.ArrayList;
import java.util.List;

public class ContactService implements IContactService {

    public static List<Contacts> contactList = new ArrayList<>();


    @Override
    public List<Contacts> findAll() {
        return contactList;
    }

    @Override
    public void save(Contacts contacts) {
        contactList.add(contacts);

    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i <contactList.size() ; i++) {
            if(id==contactList.get(i).getId()){
                 contactList.remove(i);
            }
        }

    }

    @Override
    public Contacts findById(int id) {
        for (int i = 0; i <contactList.size() ; i++) {
            if(id==contactList.get(i).getId()){
                return contactList.get(i);
            }
        }
        return null;
    }

    @Override
    public void edit(int index, Contacts contacts) {

    }


}




