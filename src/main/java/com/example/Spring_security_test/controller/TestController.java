package com.example.Spring_security_test.controller;

import org.springframework.context.annotation.Role;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {



    @GetMapping("user")
    public String usertest(){
        return "user api works";
    }

    @GetMapping("dev")
    public String devloptest(){
        return "devloper api works";
    }

    @GetMapping("Admin")
    public String adminTest(){
        return "admin api works";
    }

}
