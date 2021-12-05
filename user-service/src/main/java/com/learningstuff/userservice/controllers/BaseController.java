package com.learningstuff.userservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ৩/১২/২১
 * Time: ৪:২৯ PM
 * Email: mdshamim723@gmail.com
 */

@RestController
@RequestMapping(value = "/")
public class BaseController {

    @GetMapping(value = "")
    public ResponseEntity<String> baseUrl() {
        return ResponseEntity.status(HttpStatus.OK).body("User service base url version 1.0.1.");
    }

}
