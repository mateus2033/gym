package com.dev.gerenciadorfichas.application.services.teacher;

import com.dev.gerenciadorfichas.application.dto.teacher.UpdateTeacherInputDTO;
import com.dev.gerenciadorfichas.domain.dto.teacher.UpdateOutputDTO;
import com.dev.gerenciadorfichas.exception.*;
import com.dev.gerenciadorfichas.domain.model.Teacher;
import com.dev.gerenciadorfichas.domain.services.teacher.*;
import com.dev.gerenciadorfichas.presentation.formRequest.teacher.UpdateTeacherFormRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateTeacherApplicationService {

    @Autowired
    private ShowTeacherDomainService showTeacherDomainService;

    @Autowired
    private CreateTeacherDomainService createTeacherDomainService;

    @Autowired
    private GetTeacherByCpfDomainService getTeacherByCpfDomainService;

    @Autowired
    private GetTeacherByEmailDomainService getTeacherByEmailDomainService;

    @Autowired
    private UpdateTeacherDomainService updateTeacherDomainService;

    public UpdateOutputDTO execute(UpdateTeacherFormRequest updateData) {
        Teacher teacher = showTeacherDomainService.execute(updateData.getId());
        if (teacher == null) {
            throw new ResourceNotFoundException("Teacher not found");
        }

        Teacher teacherByEmail = getTeacherByEmailDomainService.execute(updateData.getEmail());
        if(teacherByEmail != null && teacherByEmail.getId() != teacher.getId()) {
            throw new ResourceAlreadyExistsException("Email already registered");
        }

        Teacher teacherByCPF = getTeacherByCpfDomainService.execute(updateData.getCpf());
        if(teacherByCPF != null && teacherByCPF.getId() != teacher.getId()) {
            throw new ResourceAlreadyExistsException("CPF already registered");
        }

        UpdateTeacherInputDTO teacherUpdate = new UpdateTeacherInputDTO (
                teacher.getId(),
                updateData.getName(),
                updateData.getCpf(),
                updateData.getCellphone(),
                updateData.getEmail()
        );

        return updateTeacherDomainService.execute(teacherUpdate);
    }
}
