package com.dev.gerenciadorfichas.domain.model;


import java.io.Serializable;
import java.util.UUID;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "users")
@Getter
@Setter
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

    @Column(name = "createdAt")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updatedAt")
    @UpdateTimestamp
    private Date updatedAt;

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
}
