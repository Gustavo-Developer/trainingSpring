package com.mendesscript.course.resources;

import com.mendesscript.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Gustavo", "gustavo@gmail.com", "11900000000", "1234");

        return ResponseEntity.ok().body(u);
    }
}
