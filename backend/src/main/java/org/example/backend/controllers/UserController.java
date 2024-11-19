package org.example.backend.controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.example.backend.dtos.AuthenticationRequest;
import org.example.backend.dtos.RegisterRequest;
import org.example.backend.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(userService.register(request));
    }
    @PostMapping("/authenticate")
    public ResponseEntity<String> register(@RequestBody AuthenticationRequest authRequest){
        return ResponseEntity.ok(userService.authenticate(authRequest));
    }
}
