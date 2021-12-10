import java.util.List;

public interface IContactService {
    List<Contacts> findAll();
    void save (Contacts contacts);
    void deleteById(int id);
    Contacts findById(int id);
    void edit(int index,Contacts contacts);


}
