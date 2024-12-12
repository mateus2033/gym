package com.dev.gerenciadorfichas.application.services.teacher;

import org.springframework.stereotype.Service;
import com.dev.gerenciadorfichas.domain.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import com.dev.gerenciadorfichas.domain.dto.teacher.ShowOutputDTO;
import com.dev.gerenciadorfichas.exception.ResourceNotFoundException;
import com.dev.gerenciadorfichas.domain.services.teacher.ShowTeacherDomainService;
import com.dev.gerenciadorfichas.presentation.formRequest.teacher.ShowTeacherFormRequest;
import com.dev.gerenciadorfichas.application.contracts.teacher.ShowTeacherApplicationInterface;

@Service
public class ShowTeacherApplicationService implements ShowTeacherApplicationInterface {

    @Autowired
    private ShowTeacherDomainService showTeacherDomainService;

    public ShowOutputDTO execute(ShowTeacherFormRequest showTeacher) {
        Teacher teacher = showTeacherDomainService.execute(showTeacher.getId());
        if (teacher == null) {
            throw new ResourceNotFoundException("User not found");
        }

        return new ShowOutputDTO(
                teacher.getId(),
                teacher.getName(),
                teacher.getCpf(),
                teacher.getRegistration(),
                teacher.getCellphone(),
                teacher.getEmail()
        );
    }
}
