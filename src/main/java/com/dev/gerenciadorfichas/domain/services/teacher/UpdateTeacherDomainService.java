package com.dev.gerenciadorfichas.domain.services.teacher;

import com.dev.gerenciadorfichas.application.dto.teacher.UpdateTeacherInputDTO;
import com.dev.gerenciadorfichas.domain.contracts.teacher.UpdateTeacherDomainInterface;
import com.dev.gerenciadorfichas.domain.dto.teacher.UpdateOutputDTO;
import com.dev.gerenciadorfichas.domain.mappers.teacher.TeacherMapper;
import com.dev.gerenciadorfichas.domain.model.Teacher;
import com.dev.gerenciadorfichas.domain.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateTeacherDomainService implements UpdateTeacherDomainInterface {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private TeacherMapper teacherMapper;

    public UpdateOutputDTO execute(UpdateTeacherInputDTO updateTeacher){
        Teacher teacher = teacherMapper.toEntityUpdate(updateTeacher);
        teacherRepository.updateTeacher(
                teacher.getId(),
                teacher.getName(),
                teacher.getCellphone(),
                teacher.getCpf(),
                teacher.getEmail()
        );
        return new UpdateOutputDTO(
                teacher.getId(),
                teacher.getName(),
                teacher.getCpf(),
                teacher.getRegistration(),
                teacher.getCellphone(),
                teacher.getEmail()
        );
    }
}
