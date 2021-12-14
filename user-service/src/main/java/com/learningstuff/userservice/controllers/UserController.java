package com.learningstuff.userservice.controllers;

import com.learningstuff.userservice.models.User;
import com.learningstuff.userservice.services.UserService;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ৩/১২/২১
 * Time: ৪:২৯ PM
 * Email: mdshamim723@gmail.com
 */

@AllArgsConstructor
@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;

    @GetMapping(value = "")
    public ResponseEntity<?> users() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> userById(@PathVariable(value = "id") long id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> createUser(@RequestBody @Valid User user) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.create(user));
    }

}
