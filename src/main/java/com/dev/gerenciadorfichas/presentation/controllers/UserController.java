package com.dev.gerenciadorfichas.presentation.controllers;

import com.dev.gerenciadorfichas.application.services.user.*;
import com.dev.gerenciadorfichas.presentation.formRequest.user.CreateUserFormRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/user")
public class UserController {

    @Autowired
    private CreateUserApplicationService createUserApplication;

    @Autowired
    private DeleteUserApplicationService deleteUserApplication;

    @PostMapping
    public ResponseEntity<Object> createUser(@RequestBody @Valid  CreateUserFormRequest createUser) {
        var user = this.createUserApplication.execute(createUser);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
