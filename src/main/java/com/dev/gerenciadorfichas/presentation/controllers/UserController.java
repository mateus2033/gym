package com.dev.gerenciadorfichas.presentation.controllers;

import com.dev.gerenciadorfichas.application.services.user.*;
import com.dev.gerenciadorfichas.presentation.formRequest.user.CreateUserFormRequest;
import com.dev.gerenciadorfichas.presentation.formRequest.user.DeleteUserFormRequest;
import com.dev.gerenciadorfichas.presentation.formRequest.user.ShowUserFormRequest;
import com.dev.gerenciadorfichas.presentation.formRequest.user.UpdateUserFormRequest;
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

    @Autowired
    private ShowUserApplicationService showUserApplicationService;

    @Autowired
    private UpdateUserApplicationService updateUserApplicationService;

    @Autowired
    private DeleteUserApplicationService deleteUserApplicationService;

    @PostMapping("/create")
    public ResponseEntity<Object> createUser(@RequestBody @Valid  CreateUserFormRequest createUser) {
        var user = this.createUserApplication.execute(createUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping("/show")
    public ResponseEntity<Object> showUser(@RequestBody @Valid ShowUserFormRequest showUser) {
        var user = this.showUserApplicationService.execute(showUser);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @PatchMapping("/update")
    public ResponseEntity<Object> updateUser(@RequestBody @Valid UpdateUserFormRequest updateUser) {
        var user = this.updateUserApplicationService.execute(updateUser);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteUser(@RequestBody @Valid DeleteUserFormRequest deleteUser) {
        var user = this.deleteUserApplicationService.execute(deleteUser);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
