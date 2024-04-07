package com.example.Spring_security_test.controller;

import com.example.Spring_security_test.model.Login;
import com.example.Spring_security_test.model.Register;
import com.example.Spring_security_test.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Register register) {
        return ResponseEntity.ok().body(service.register(register));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Login login) {
        return service.authenticate(login);
    }
}
