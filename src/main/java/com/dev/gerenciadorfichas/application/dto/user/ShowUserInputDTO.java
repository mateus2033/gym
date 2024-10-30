package com.dev.gerenciadorfichas.application.dto.user;

import java.util.UUID;

public class ShowUserInputDTO {

    private UUID id;

    public ShowUserInputDTO(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
