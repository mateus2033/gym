package com.dev.gerenciadorfichas.presentation.formRequest.user;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
public class CreateUserFormRequest {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "CPF is required")
    @CPF
    private String cpf;

    @NotBlank(message = "Date of birth is required")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Date must be in the format YYYY-MM-DD")
    private String data_birth;

    private String cellphone;

    @NotBlank(message = "Name is required")
    @Email(message = "Invalid email")
    private String email;

    @NotBlank(message = "Name is required")
    @Size(min=6, message = "Password must be at least 6 characters long")
    private String password;
}
