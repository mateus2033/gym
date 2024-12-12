package com.dev.gerenciadorfichas.domain.dto.teacher;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CreateOutputDTO {
    private UUID id;
    private String name;
    private String cpf;
    private Integer registration;
    private String cellphone;
    private String email;

    public CreateOutputDTO(UUID id, String name, String cpf, Integer registration, String cellphone, String email) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.registration = registration;
        this.cellphone = cellphone;
        this.email = email;
    }
}
