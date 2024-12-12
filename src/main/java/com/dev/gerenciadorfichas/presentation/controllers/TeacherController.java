package com.dev.gerenciadorfichas.presentation.controllers;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.dev.gerenciadorfichas.application.services.teacher.*;
import com.dev.gerenciadorfichas.presentation.formRequest.teacher.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private CreateTeacherApplicationService createTeacherApplication;

    @Autowired
    private ShowTeacherApplicationService showTeacherApplication;

    @Autowired
    private UpdateTeacherApplicationService updateTeacherApplicationService;

    @Autowired
    private DeleteTeacherApplicationService deleteTeacherApplicationService;

    @PostMapping("/create")
    public ResponseEntity<Object> createTeacher(@RequestBody @Valid CreateTeacherFormRequest createTeacher) {
        var teacher = this.createTeacherApplication.execute(createTeacher);
        return ResponseEntity.status(HttpStatus.CREATED).body(teacher);
    }

    @GetMapping("/show")
    public ResponseEntity<Object> showTeacher(@RequestBody @Valid ShowTeacherFormRequest showTeacher) {
        var teacher = this.showTeacherApplication.execute(showTeacher);
        return ResponseEntity.status(HttpStatus.OK).body(teacher);
    }

    @PatchMapping("/update")
    public ResponseEntity<Object> updateTeacher(@RequestBody @Valid UpdateTeacherFormRequest updateTeacher) {
        var teacher = this.updateTeacherApplicationService.execute(updateTeacher);
        return ResponseEntity.status(HttpStatus.OK).body(teacher);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteTeacher(@RequestBody @Valid DeleteTeacherFormRequest deleteTeacher) {
        var teacher = this.deleteTeacherApplicationService.execute(deleteTeacher);
        return ResponseEntity.status(HttpStatus.OK).body(teacher);
    }
}
