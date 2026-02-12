package com.talentotech2.enviroment.model;
import java.lang.annotation.Inherited;
import javax.annotation.processing.Generated;
import jakarta.persistence.*;

//CREANDO LA ENTIDAD O TABLA
@Entity
@Table(name ="users")
public class User {
    //CREANDO EL id PRIMARY KEY
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    //CREANDO UNA COLUMNA O CAMPO QUE NO ACEPTA NULOS Y ES UNICO
    @Column(nullable =false,unique = true)
    private String username;
    
    @Column(nullable = false)
    private String email;
    
    //CREAR UN CONTRUCTOR VACIO
    public User(){}

    //CREANDO GETTERS AND SETTERS
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    

    
}
