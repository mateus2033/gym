package com.dev.gerenciadorfichas.domain.contracts.teacher;

import com.dev.gerenciadorfichas.application.dto.teacher.UpdateTeacherInputDTO;
import com.dev.gerenciadorfichas.domain.dto.teacher.UpdateOutputDTO;

public interface UpdateTeacherDomainInterface {
    UpdateOutputDTO execute(UpdateTeacherInputDTO updateTeacher);
}
