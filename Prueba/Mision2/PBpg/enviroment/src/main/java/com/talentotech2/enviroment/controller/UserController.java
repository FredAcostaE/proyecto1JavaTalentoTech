package com.talentotech2.enviroment.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talentotech2.enviroment.model.User;
import com.talentotech2.enviroment.repository.UserRepository;
import org.springframework.web.server.ResponseStatusException; //librerias para mostrar mensaje de error exception
import org.springframework.http.HttpStatus; //librerias para mostrar mensaje de error exception

@RestController//Api para tener peticiones
@RequestMapping("/api/users") //Para mapear una ruta

public class UserController {
    private final UserRepository userRepository; //Instanciando interfaz
    public UserController(UserRepository userRepository){
    this.userRepository = userRepository;
    }

    //Método usado para guardar usuario
    @PostMapping
    public User create(@RequestBody User user){
        return userRepository.save(user);
    }
    //Método para consultar
    @GetMapping
    public List<User> findAll(){
        return userRepository.findAll();
    }

    //Creando un nuevo servicio para consultar usuario por id
    // READ BY ID
    @GetMapping("/{id}") //Trae la ruta especificada en RequestMapping y busca por id
    public User findByID(@PathVariable Long id){
        return userRepository.findById(id)
        .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado"));
    }

    //Método modificar
    //UPDATE
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        user.setUsername(userDetails.getUsername());
        user.setEmail(userDetails.getEmail());
        return userRepository.save(user);
    }   
}
