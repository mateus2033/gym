package com.dev.gerenciadorfichas.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "teachers")
public class Teacher implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(nullable = false, length = 20)
    private String cellphone;

    @Column(nullable = false, length = 14, unique = true)
    private String cpf;

    @Column(nullable = false, unique = true)
    private Integer registration;

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

    public Teacher() {}

    public Teacher(UUID id, String name, String cellphone, String cpf, Integer registration, String email, String password) {
        this.id = id;
        this.name = name;
        this.cellphone = cellphone;
        this.cpf = cpf;
        this.registration = registration;
        this.email = email;
        this.password = password;
    }
}
