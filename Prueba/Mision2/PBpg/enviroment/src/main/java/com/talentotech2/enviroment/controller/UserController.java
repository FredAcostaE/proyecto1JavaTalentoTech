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
import com.talentotech2.enviroment.dto.LoginRequest;
import com.talentotech2.enviroment.service.UserService;
import com.talentotech2.enviroment.repository.UserRepository;
import com.talentotech2.enviroment.service.UserService;

import org.springframework.web.server.ResponseStatusException; //librerias para mostrar mensaje de error exception
import org.springframework.http.HttpStatus; //librerias para mostrar mensaje de error exception
import org.springframework.http.ResponseEntity;

@RestController//Api para tener peticiones
@RequestMapping("/api/users") //Para mapear una ruta

public class UserController {
    private final UserService userService;
    public UserController(UserService userService){
    this.userService = userService;
    }

    //Método usado para guardar usuario
    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED)
        .body(userService.crearUsuario(user));
    }
    //Método para consultar
    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    //Creando un nuevo servicio para consultar usuario por id
    // READ BY ID
    @GetMapping("/{id}") //Trae la ruta especificada en RequestMapping y busca por id
    public User findByID(@PathVariable Long id){
        return userService.findById(id)
        .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado"));
    }

    //Método modificar
    //UPDATE
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
      
         
        return userService.update(id, userDetails);
    }   

    @PostMapping("/login") //DECORADOR QUE TRAE LA URL
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        //TODO: process POST request
        String response = userService.login(request);                
        return ResponseEntity.ok(response);
    }
    
}
