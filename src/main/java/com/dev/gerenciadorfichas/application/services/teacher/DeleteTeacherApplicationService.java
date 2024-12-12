package com.dev.gerenciadorfichas.application.services.teacher;

import com.dev.gerenciadorfichas.domain.model.Teacher;
import com.dev.gerenciadorfichas.domain.services.teacher.ShowTeacherDomainService;
import com.dev.gerenciadorfichas.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.dev.gerenciadorfichas.domain.dto.teacher.DeleteOutputDTO;
import com.dev.gerenciadorfichas.domain.services.teacher.DeleteTeacherDomainService;
import com.dev.gerenciadorfichas.application.contracts.teacher.DeleteTeacherApplicationInterface;
import com.dev.gerenciadorfichas.presentation.formRequest.teacher.DeleteTeacherFormRequest;

@Service
public class DeleteTeacherApplicationService implements DeleteTeacherApplicationInterface {

    @Autowired
    private DeleteTeacherDomainService deleteTeacherDomainService;

    @Autowired
    private ShowTeacherDomainService showTeacherDomainService;

    public DeleteOutputDTO execute(DeleteTeacherFormRequest deleteTeacher){
        Teacher teacher = showTeacherDomainService.execute(deleteTeacher.getId());
        if (teacher == null) {
            throw new ResourceNotFoundException("Teacher not found");
        }

        deleteTeacherDomainService.execute(teacher.getId());
        return new DeleteOutputDTO(
                "Teacher deleted successfully"
        );
    }
}
