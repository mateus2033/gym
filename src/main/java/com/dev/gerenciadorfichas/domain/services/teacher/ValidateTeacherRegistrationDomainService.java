package com.dev.gerenciadorfichas.domain.services.teacher;

import java.util.Random;
import org.springframework.stereotype.Service;
import com.dev.gerenciadorfichas.domain.model.Teacher;
import com.dev.gerenciadorfichas.domain.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.dev.gerenciadorfichas.domain.contracts.teacher.ValidateTeacherRegistrationDomainInterface;

@Service
public class ValidateTeacherRegistrationDomainService implements ValidateTeacherRegistrationDomainInterface {

    final Integer number_min = 1000;
    final Integer number_max = 99999999;

    @Autowired
    TeacherRepository teacherRepository;

    public Integer execute() {
        Teacher teacher = null;
        int registration = 0;
        do {
            Random random = new Random();
            registration = random. nextInt(number_min, number_max);
            teacher = teacherRepository.findTeacherByRegistration(registration);
        } while (teacher != null);
        return registration;
    }
}
