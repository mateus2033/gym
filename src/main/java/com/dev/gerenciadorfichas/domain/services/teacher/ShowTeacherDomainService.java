package com.dev.gerenciadorfichas.domain.services.teacher;

import com.dev.gerenciadorfichas.domain.contracts.teacher.ShowTeacherDomainInterface;
import com.dev.gerenciadorfichas.domain.model.Teacher;
import com.dev.gerenciadorfichas.domain.repositories.TeacherRepository;
import com.dev.gerenciadorfichas.utils.uuid.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class ShowTeacherDomainService implements ShowTeacherDomainInterface {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher execute(String dataId) {
        UUID id = UuidUtil.convertStringToUUID(dataId);
        return this.teacherRepository.findTeacherById(id);
    }
}
