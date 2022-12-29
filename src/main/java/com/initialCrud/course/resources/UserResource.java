package com.initialCrud.course.resources;


import com.initialCrud.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {


   @GetMapping
    public ResponseEntity<User> findAll() {
       System.out.println("chegou");
       User u = new User(1L, "Udineygay", "gayzin24@gmail.com", "9999999999", "12345");
       return ResponseEntity.ok().body(u);
   }
}

