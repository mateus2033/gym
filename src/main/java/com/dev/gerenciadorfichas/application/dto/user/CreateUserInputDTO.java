package com.dev.gerenciadorfichas.application.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserInputDTO {

    private String name;
    private String cpf;
    private String dataBirth;
    private String cellphone;
    private String email;
    private String password;

    public CreateUserInputDTO(String name, String cpf, String dataBirth, String cellphone, String email, String password) {
        this.name = name;
        this.cpf = cpf;
        this.dataBirth = dataBirth;
        this.cellphone = cellphone;
        this.email = email;
        this.password = password;
    }
}
