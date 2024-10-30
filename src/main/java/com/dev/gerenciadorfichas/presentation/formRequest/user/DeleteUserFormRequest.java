package com.dev.gerenciadorfichas.presentation.formRequest.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class DeleteUserFormRequest {

    @NotBlank(message = "Id is required")
    @Size(min = 36, message = "Id must be exactly 36 characters long")
    private String id;
}
