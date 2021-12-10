public class Contacts {
    int id;
    String phoneNb;
    String groupOfContact;
    String name;
    String sex;
    String address;
    String dob;
    String email;

    public Contacts() {
    }
//    int idNumber = 1;

    public Contacts(int id, String phoneNb, String groupOfContact, String name, String sex, String address, String dob, String email) {
        this.id = id;
        this.phoneNb = phoneNb;
        this.groupOfContact = groupOfContact;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.dob = dob;
        this.email = email;
    }

    public Contacts(int id, String phoneNb, String groupOfContact, String name, String sex, String dob, String email) {
    }

    public Contacts(String phoneNb, String groupOfContact, String name, String sex, String dob, String email) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNb() {
        return phoneNb;
    }

    public void setPhoneNb(String phoneNb) {
        this.phoneNb = phoneNb;
    }

    public String getGroupOfContact() {
        return groupOfContact;
    }

    public void setGroupOfContact(String groupOfContact) {
        this.groupOfContact = groupOfContact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "contacts{" +
                "id=" + id +
                ", phoneNb='" + phoneNb + '\'' +
                ", groupOfContact='" + groupOfContact + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
