package com.dev.gerenciadorfichas.domain.services.teacher;

import com.dev.gerenciadorfichas.domain.contracts.teacher.DeleteTeacherDomainInterface;
import com.dev.gerenciadorfichas.domain.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class DeleteTeacherDomainService implements DeleteTeacherDomainInterface {

    @Autowired
    private TeacherRepository teacherRepository;

    public void execute(UUID teacherId) {
        teacherRepository.deleteById(teacherId);
    }
}
