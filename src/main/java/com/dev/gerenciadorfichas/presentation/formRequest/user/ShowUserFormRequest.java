package com.dev.gerenciadorfichas.presentation.formRequest.user;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class ShowUserFormRequest {

    @NotBlank(message = "Id is required")
    @Size(min = 36, message = "Id must be min 36 characters long")
    private String id;
}
