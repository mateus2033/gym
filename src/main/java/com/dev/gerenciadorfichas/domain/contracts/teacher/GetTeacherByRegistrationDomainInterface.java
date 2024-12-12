package com.dev.gerenciadorfichas.domain.contracts.teacher;

import com.dev.gerenciadorfichas.domain.model.Teacher;

public interface GetTeacherByRegistrationDomainInterface {
    public Teacher execute(Integer registration);
}
