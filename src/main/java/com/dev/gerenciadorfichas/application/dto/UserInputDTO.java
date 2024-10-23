package com.dev.gerenciadorfichas.application.dto;


public class UserInputDTO {

    private String name;
    private String cpf;
    private String dataBirth;
    private String cellphone;
    private String email;
    private String password;

    public UserInputDTO(String name, String cpf, String dataBirth, String cellphone, String email, String password) {
        this.name = name;
        this.cpf = cpf;
        this.dataBirth = dataBirth;
        this.cellphone = cellphone;
        this.email = email;
        this.password = password;
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

    public String getDataBirth() {
        return dataBirth;
    }

    public void setDataBirth(String dataBirth) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
