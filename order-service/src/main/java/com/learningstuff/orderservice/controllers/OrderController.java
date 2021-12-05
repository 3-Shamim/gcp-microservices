package com.learningstuff.orderservice.controllers;

import com.learningstuff.orderservice.dao.UserService;
import com.learningstuff.orderservice.dao.UserServiceFeignClient;
import lombok.AllArgsConstructor;
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

@AllArgsConstructor
@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    private final UserService userService;
    private final UserServiceFeignClient userServiceFeignClient;

    @GetMapping(value = "/access-user-base-url")
    public ResponseEntity<String> baseUrl() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getBaseUrl());
    }

    @GetMapping(value = "/access-user-base-url-feign")
    public ResponseEntity<String> baseUrl1() {
        return ResponseEntity.status(HttpStatus.OK).body(userServiceFeignClient.getBaseUrl());
    }

}
