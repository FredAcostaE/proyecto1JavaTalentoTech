package com.talentotech2.enviroment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableMethodSecurity
public class SecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
        .csrf(csrf -> csrf.disable())  //Desabilitar el csrf(formulario), si no se desactiva falla POST,PUT,DELETE
        .authorizeHttpRequests(auth -> auth
        .requestMatchers("/api/users").permitAll() //Se permite acceder a traves de esta ruta sin login
        .requestMatchers("/api/users/{id}").permitAll() //Se permite acceder a traves de esta ruta con id
        .requestMatchers("/api/users/login").permitAll() //Se permite acceder a traves de esta ruta sin login
        .anyRequest().authenticated())//Especifica que el acceso a otras rutas necesita autentificación por login
        .formLogin(form -> form.disable()) //Deshabilita loguearse
        .httpBasic(basic -> basic.disable());
        return http.build();        
          
    }
    
}
