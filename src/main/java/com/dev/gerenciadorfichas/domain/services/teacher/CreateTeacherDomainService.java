package com.dev.gerenciadorfichas.domain.services.teacher;

import com.dev.gerenciadorfichas.application.dto.teacher.CreateTeacherInputDTO;
import com.dev.gerenciadorfichas.domain.contracts.teacher.CreateTeacherDomainInterface;
import com.dev.gerenciadorfichas.domain.dto.teacher.CreateOutputDTO;
import com.dev.gerenciadorfichas.domain.mappers.teacher.TeacherMapper;
import com.dev.gerenciadorfichas.domain.model.Teacher;
import com.dev.gerenciadorfichas.domain.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateTeacherDomainService implements CreateTeacherDomainInterface {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private TeacherMapper teacherMapper;

    public CreateOutputDTO execute(CreateTeacherInputDTO teacherData) {
        Teacher teacher = teacherMapper.toEntityCreate(teacherData);
        teacherRepository.save(teacher);
        return new CreateOutputDTO(
                teacher.getId(),
                teacher.getName(),
                teacher.getCpf(),
                teacher.getRegistration(),
                teacher.getCellphone(),
                teacher.getEmail()
        );
    }
}
