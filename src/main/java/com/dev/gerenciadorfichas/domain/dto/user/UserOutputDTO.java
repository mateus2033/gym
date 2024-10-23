package com.dev.gerenciadorfichas.domain.dto.user;

import java.util.Date;

public class UserOutputDTO {

    private String name;
    private String cpf;
    private Date dataBirth;
    private String cellphone;
    private String email;

    public UserOutputDTO(String name, String cpf, Date dataBirth, String cellphone, String email) {
        this.name = name;
        this.cpf = cpf;
        this.dataBirth = dataBirth;
        this.cellphone = cellphone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataBirth() {
        return dataBirth;
    }

    public void setDataBirth(Date dataBirth) {
        this.dataBirth = dataBirth;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
