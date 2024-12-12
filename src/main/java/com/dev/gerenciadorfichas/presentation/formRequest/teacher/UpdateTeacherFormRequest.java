package com.dev.gerenciadorfichas.presentation.formRequest.teacher;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
public class UpdateTeacherFormRequest {
    @NotBlank(message = "Id is required")
    @Size(min = 36, message = "Id must be min 36 characters long")
    private String id;

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
}
