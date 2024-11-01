package com.dev.gerenciadorfichas.application.dto.user;

import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
public class UpdateUserInputDTO {

    private UUID id;
    private String name;
    private String cpf;
    private String dataBirth;
    private String cellphone;
    private String email;

    public UpdateUserInputDTO(UUID id, String name, String cpf, String dataBirth, String cellphone, String email) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.dataBirth = dataBirth;
        this.cellphone = cellphone;
        this.email = email;
    }
}
