
package web.afip.dgi.ag66.model;

import java.io.Serializable;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agentes")
@Access(AccessType.FIELD)
//public class Agente extends ParentEntity{
public class Agente implements Serializable{    
    
    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    
    @Column(name = "id_estructura", nullable = true)
    private int idEstructura;
    
    @Column(name = "telefono", nullable = true, length = 50)
    private String telefono;
    
    @Column(name = "mail", nullable = true, length = 50)
    private String mail;
    
    @Column(name = "legajo", nullable = true, length = 50)
    private String legajo;
    
    @Column(name = "cuil", nullable = true, length = 13)
    private String cuil;
    
    @Column(name = "id_usuario", nullable = true)
    private int idUsuario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEstructura() {
        return idEstructura;
    }

    public void setIdEstructura(int id_estructura) {
        this.idEstructura = id_estructura;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int id_usuario) {
        this.idUsuario = id_usuario;
    }


    
}
