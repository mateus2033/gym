package com.dev.gerenciadorfichas.domain.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteOutputDTO {

    private String response;

    public DeleteOutputDTO(String response) {
        this.response = response;
    }
}
