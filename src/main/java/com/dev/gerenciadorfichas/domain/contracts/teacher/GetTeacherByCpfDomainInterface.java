package com.dev.gerenciadorfichas.domain.contracts.teacher;

import com.dev.gerenciadorfichas.domain.model.Teacher;

public interface GetTeacherByCpfDomainInterface {
    public Teacher execute(String cpf);
}
