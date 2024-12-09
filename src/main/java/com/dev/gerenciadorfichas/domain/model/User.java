package com.dev.gerenciadorfichas.domain.model;


import java.io.Serializable;
import java.util.UUID;
import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

@Entity
@Table(name = "users")
public class User implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(nullable = false, length = 14, unique = true)
    private String cpf;

    @Column(nullable = false)
    private Date data_birth;

    @Column(nullable = false, length = 20)
    private String cellphone;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 255)
    private String password;

    public User() {}

    public User(UUID id, String name, String cpf, Date data_birth, String cellphone, String email, String password) {
        super();
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.data_birth = data_birth;
        this.cellphone = cellphone;
        this.email = email;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Date getData_birth() {
        return data_birth;
    }

    public void setData_birth(Date data_birth) {
        this.data_birth = data_birth;
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
