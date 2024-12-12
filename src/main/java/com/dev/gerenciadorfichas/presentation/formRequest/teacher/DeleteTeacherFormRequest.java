package com.dev.gerenciadorfichas.presentation.formRequest.teacher;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class DeleteTeacherFormRequest {
    @NotBlank(message = "Id is required")
    @Size(min = 36, message = "Id must be min 36 characters long")
    private String id;
}
