package com.dev.gerenciadorfichas.application.dto.teacher;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTeacherInputDTO {
    private String name;
    private String cpf;
    private Integer registration;
    private String cellphone;
    private String email;
    private String password;

    public CreateTeacherInputDTO(String name, String cpf, Integer registration, String cellphone, String email, String password) {
        this.name = name;
        this.cpf = cpf;
        this.registration = registration;
        this.cellphone = cellphone;
        this.email = email;
        this.password = password;
    }
}
