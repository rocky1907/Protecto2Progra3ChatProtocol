package chatLogic;

import chatData.DataUser;
import chatProtocol.User;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class ServiceUsuariosContactos {
    private static ServiceUsuariosContactos theInstance;
    public static ServiceUsuariosContactos instance(){
        if (theInstance==null){ 
            theInstance=new ServiceUsuariosContactos();
        }
        return theInstance;
    }
    
    private DataUser data;
    
    public ServiceUsuariosContactos() {
       data =  new DataUser();
    }
    @XmlElementWrapper(name="Lista Contactos")
    @XmlElement(name="Contacto")
    public List<User> getContactos() {
        return data.getContactos();
    }

    public void add(User c){
        data.getContactos().add(c);
    }

    public List<User> buscar(User o){
        List<User> result = new ArrayList<>();
        for(User c:data.getContactos()) {if (c.getNombre().contains(o.getNombre())) result.add(c);};
        return result;
    }    
    public User buscar(int o){
        if(data.getContactos().size()>0){
            return data.getContactos().get(o);
        }else
            return null;
    }
}
