package chatLogic;

import chatData.DataUser;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ServiceUsuariosContactos {
    private static ServiceUsuariosContactos theInstance;
    public static ServiceUsuariosContactos instance(){
        if (theInstance==null){ 
            theInstance=new ServiceUsuariosContactos();
        }
        return theInstance;
    }
    
    private DataUser data;
    
    public void setInstance(){
        theInstance = null;
    }
    
    public ServiceUsuariosContactos() {
       data =  new DataUser();
    }
    
    public void setContactos(List<Contacto> li){
        this.data.setContactos(li);
    }
    
    @XmlElementWrapper(name="Lista")
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
    
    public Contacto buscar(String name){
        Contacto result = null;
        for(int i=0;i<data.getContactos().size();i++){ 
            result = data.getContactos().get(i);}
        return result;
    }
    
    public List<Contacto> buscar2(String name){
        List<Contacto> result = new ArrayList<>();
        for(Contacto c:data.getContactos()) {if (c.getNombre().equals(name)) result.add(c);};
        return result;
    }
}
