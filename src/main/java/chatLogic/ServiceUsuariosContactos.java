package chatLogic;

import chatData.DataUser;
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
    public List<Contacto> getContactos() {
        return data.getContactos();
    }

    public void add(Contacto c){
        data.getContactos().add(c);
    }

    public List<Contacto> buscar(Contacto o){
        List<Contacto> result = new ArrayList<>();
        for(Contacto c:data.getContactos()) {if (c.getNombre().contains(o.getNombre())) result.add(c);};
        return result;
    }    
    public Contacto buscar(int o){
        if(data.getContactos().size()>0){
            return data.getContactos().get(o);
        }else
            return null;
    }
}
