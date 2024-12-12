package com.dev.gerenciadorfichas.domain.services.teacher;

import com.dev.gerenciadorfichas.domain.contracts.teacher.GetTeacherByCpfDomainInterface;
import com.dev.gerenciadorfichas.domain.model.Teacher;
import com.dev.gerenciadorfichas.domain.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetTeacherByCpfDomainService implements GetTeacherByCpfDomainInterface {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher execute(String cpf) {
        return this.teacherRepository.findTeacherByCpf(cpf);
    }
}
