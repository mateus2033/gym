package com.dev.gerenciadorfichas.domain.services.teacher;

import com.dev.gerenciadorfichas.domain.model.Teacher;
import com.dev.gerenciadorfichas.domain.repositories.TeacherRepository;
import com.dev.gerenciadorfichas.domain.contracts.teacher.GetTeacherByRegistrationDomainInterface;
import org.springframework.stereotype.Service;

@Service
public class GetTeacherByRegistrationDomainService implements GetTeacherByRegistrationDomainInterface {

    private TeacherRepository teacherRepository;

    public Teacher execute(Integer registration) {
        return this.teacherRepository.findTeacherByRegistration(registration);
    }
}
