package com.dev.gerenciadorfichas.presentation.formRequest.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UpdateUserFormRequest {

    @NotBlank(message = "Id is required")
    @Size(min = 36, message = "Id must be min 36 characters long")
    private String id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Date of birth is required")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Date must be in the format YYYY-MM-DD")
    private String data_birth;

    @NotBlank(message = "Cellphone of birth is required")
    @Pattern(regexp = "(\\d{2}) \\d{5}-\\d{4}", message = "Date must be in the format (xx) xxxxxx-xxxx")
    private String cellphone;
}
