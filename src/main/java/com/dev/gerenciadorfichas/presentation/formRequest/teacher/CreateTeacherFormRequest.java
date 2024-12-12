package com.dev.gerenciadorfichas.presentation.formRequest.teacher;

import lombok.Data;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

@Data
public class CreateTeacherFormRequest {
    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "CPF is required")
    @CPF
    private String cpf;

    @Pattern(regexp = "^\\(\\d{2}\\) \\d{5}-\\d{4}$", message = "Invalid cellphone number. It should be in the format (XX) XXXXX-XXXX")
    private String cellphone;

    @NotBlank(message = "Name is required")
    @Email(message = "Invalid email")
    private String email;

    @NotBlank(message = "Name is required")
    @Size(min=6, message = "Password must be at least 6 characters long")
    private String password;
}
