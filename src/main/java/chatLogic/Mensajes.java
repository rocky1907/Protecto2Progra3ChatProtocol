package chatLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Lensajes")
public class Mensajes {
    String destinatario;
    List<Texto> mensajes;

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mensajes other = (Mensajes) obj;
        if (!Objects.equals(this.destinatario, other.destinatario)) {
            return false;
        }
        return true;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    @XmlElementWrapper(name="Lista")
    @XmlElement(name="Texto")
    public List<Texto> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Texto> mensajes) {
        this.mensajes = mensajes;
    }

    public Mensajes() {
        this.destinatario = "";
        this.mensajes = new ArrayList<>();
    }
}
