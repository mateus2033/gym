package com.dev.gerenciadorfichas.domain.dto.user;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class CreateOutputDTO {

    private UUID id;
    private String name;
    private String cpf;
    private Date dataBirth;
    private String cellphone;
    private String email;

    public CreateOutputDTO(UUID id, String name, String cpf, Date dataBirth, String cellphone, String email) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.dataBirth = dataBirth;
        this.cellphone = cellphone;
        this.email = email;
    }
}
