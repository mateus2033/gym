package com.dev.gerenciadorfichas.domain.contracts.teacher;

import com.dev.gerenciadorfichas.domain.model.Teacher;

public interface GetTeacherByEmailDomainInterface {
    public Teacher execute(String email);
}
