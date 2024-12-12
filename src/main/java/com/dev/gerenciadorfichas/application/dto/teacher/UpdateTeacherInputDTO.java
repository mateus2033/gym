package com.dev.gerenciadorfichas.application.dto.teacher;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UpdateTeacherInputDTO {
    private UUID id;
    private String name;
    private String cpf;
    private String cellphone;
    private String email;

    public UpdateTeacherInputDTO(UUID id, String name, String cpf, String cellphone, String email) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.cellphone = cellphone;
        this.email = email;
    }
}
