package com.dev.gerenciadorfichas.domain.model;

import java.io.Serializable;
import java.util.UUID;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "exercises")
public class Exercise implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(nullable = false)
    private Integer series;

    @Column(nullable = false, length = 255)
    private String equipment;

    @Column(nullable = false, length = 255)
    private String description;

    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;

    public Exercise(UUID id, String name, Integer series, String equipment, String description, Training training) {
        super();
        this.id = id;
        this.name = name;
        this.series = series;
        this.equipment = equipment;
        this.description = description;
        this.training = training;
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

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }
}
