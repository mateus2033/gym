package com.dev.gerenciadorfichas.domain.contracts.teacher;

import com.dev.gerenciadorfichas.domain.model.Teacher;

public interface ShowTeacherDomainInterface {
    public Teacher execute(String dataId);
}
