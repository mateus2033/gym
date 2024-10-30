package com.dev.gerenciadorfichas.presentation.formRequest.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
public class UpdateUserFormRequest {

    @NotBlank(message = "Id is required")
    @Size(min = 36, message = "Id must be min 36 characters long")
    private String id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Name is required")
    @CPF
    private String cpf;

    @NotBlank(message = "Date of birth is required")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Date must be in the format YYYY-MM-DD")
    private String data_birth;

    private String cellphone;

    @NotBlank(message = "Name is required")
    @Email(message = "Invalid email")
    private String email;
}
