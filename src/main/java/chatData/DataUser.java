package chatData;

import chatProtocol.User;
import java.util.ArrayList;
import java.util.List;

public class DataUser {
    List<User> contactos;

    public List<User> getContactos() {
        return contactos;
    }

    public void setContactos(List<User> contactos) {
        this.contactos = contactos;
    }
    
    public DataUser(){
        contactos = new ArrayList<>();
    }
}
