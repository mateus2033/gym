package com.dev.gerenciadorfichas.domain.model;

import java.io.Serializable;
import java.util.UUID;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trainings")
public class Training implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 255)
    private String status;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(nullable = false, length = 200)
    private String muscle_group;

    @Column(nullable = false)
    private Date date_creation;

    @Column(nullable = false, length = 255)
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Training(UUID id, String status, String name, String muscle_group, Date date_creation, String description, User user) {
        super();
        this.id = id;
        this.status = status;
        this.name = name;
        this.muscle_group = muscle_group;
        this.date_creation = date_creation;
        this.description = description;
        this.user = user;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMuscle_group() {
        return muscle_group;
    }

    public void setMuscle_group(String muscle_group) {
        this.muscle_group = muscle_group;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
