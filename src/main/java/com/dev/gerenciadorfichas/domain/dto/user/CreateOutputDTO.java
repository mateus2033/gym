package com.dev.gerenciadorfichas.domain.dto.user;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class CreateOutputDTO {

    private String name;
    private String cpf;
    private Date dataBirth;
    private String cellphone;
    private String email;

    public CreateOutputDTO(String name, String cpf, Date dataBirth, String cellphone, String email) {
        this.name = name;
        this.cpf = cpf;
        this.dataBirth = dataBirth;
        this.cellphone = cellphone;
        this.email = email;
    }
}
