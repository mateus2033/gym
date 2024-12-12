package com.dev.gerenciadorfichas.application.services.teacher;

import com.dev.gerenciadorfichas.application.contracts.teacher.CreateTeacherApplicationInterface;
import com.dev.gerenciadorfichas.application.dto.teacher.CreateTeacherInputDTO;
import com.dev.gerenciadorfichas.domain.dto.teacher.CreateOutputDTO;
import com.dev.gerenciadorfichas.domain.model.Teacher;
import com.dev.gerenciadorfichas.domain.services.teacher.*;
import com.dev.gerenciadorfichas.exception.ResourceAlreadyExistsException;
import com.dev.gerenciadorfichas.presentation.formRequest.teacher.CreateTeacherFormRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateTeacherApplicationService implements CreateTeacherApplicationInterface {

    @Autowired
    private CreateTeacherDomainService createTeacherDomainService;

    @Autowired
    private GetTeacherByCpfDomainService getTeacherByCpfDomainService;

    @Autowired
    private GetTeacherByEmailDomainService getTeacherByEmailDomainService;

    @Autowired
    private ValidateTeacherRegistrationDomainService validateTeacherRegistrationDomainService;

    public CreateOutputDTO execute(CreateTeacherFormRequest teacherData) {
        Teacher email = this.getTeacherByEmailDomainService.execute(teacherData.getEmail());
        if (email != null) {
            throw new ResourceAlreadyExistsException("Email already registered");
        }

        Teacher cpf = this.getTeacherByCpfDomainService.execute(teacherData.getCpf());
        if (cpf != null) {
            throw new ResourceAlreadyExistsException("CPF already registered");
        }

        Integer registration = validateTeacherRegistrationDomainService.execute();
        CreateTeacherInputDTO teacher = new CreateTeacherInputDTO(
                teacherData.getName(),
                teacherData.getCpf(),
                registration,
                teacherData.getCellphone(),
                teacherData.getEmail(),
                teacherData.getPassword()
        );
        return this.createTeacherDomainService.execute(teacher);
    }
}
