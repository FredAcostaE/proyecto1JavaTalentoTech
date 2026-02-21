package com.talentotech2.enviroment.repository;
import com.talentotech2.enviroment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

//UserRepository es creado para usarla como una interfaz. JpaRepository recibe usuario y llave primaria
public interface  UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
