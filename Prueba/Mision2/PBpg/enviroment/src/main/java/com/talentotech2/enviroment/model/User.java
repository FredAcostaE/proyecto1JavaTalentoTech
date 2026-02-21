package com.talentotech2.enviroment.model;
import java.lang.annotation.Inherited;
import javax.annotation.processing.Generated;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
/* import org.w3c.dom.Text; */

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
    
    //Creando el email
    @Column(nullable = false, unique = true)
    private String email;

    //Creando el password del email
    @Column(nullable = false, length = 800)
    private String password;

    //Creando el rol de tipo enum
    @Enumerated(EnumType.STRING)
    private Role role;

    //CREANDO EL METODO DE AUDITORIA
    @CreationTimestamp
    @Column (name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    //CREANDO EL METODO UPDATE PARA MODIFICAR CAMPOS
    @UpdateTimestamp
    @Column(name ="update_at")
    private LocalDateTime updatedAt;
    
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }   
    
}
