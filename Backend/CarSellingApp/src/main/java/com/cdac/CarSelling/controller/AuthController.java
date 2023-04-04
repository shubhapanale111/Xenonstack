package com.cdac.CarSelling.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.CarSelling.dto.LoginRequest;
import com.cdac.CarSelling.dto.PasswordResetRequest;
import com.cdac.CarSelling.dto.RegisterRequest;
import com.cdac.CarSelling.model.User;
import com.cdac.CarSelling.service.AuthService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1/auth")
@RestController
public class AuthController
{
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.status(200).body(authService.getAllUser());
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RegisterRequest registerRequest) throws Exception
    {
        System.out.println("Register" +registerRequest.toString());
        return ResponseEntity.status(201).body(authService.createUser(registerRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest){
        return ResponseEntity.status(200).body(authService.loginUser(loginRequest));
    }

    @GetMapping("/")
    public ResponseEntity<?> getUser(@PathVariable Long userId){
        return ResponseEntity.status(200).body(authService.getLoggedInUser());
    }

    @PutMapping("/reset-password")
    public ResponseEntity<?> updatePassword(@RequestBody PasswordResetRequest resetRequest){
        return ResponseEntity.status(200).body(authService.updatePassword(resetRequest));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteUser(User user){
        return ResponseEntity.status(200).body(authService.deleteUser());
    }

}

