package chatData;

import chatLogic.Contacto;
import java.util.ArrayList;
import java.util.List;

public class DataUser {
    List<Contacto> contactos;

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }
    
    public DataUser(){
        contactos = new ArrayList<>();
    }
}
