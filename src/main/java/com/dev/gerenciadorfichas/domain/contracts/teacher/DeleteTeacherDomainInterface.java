package com.dev.gerenciadorfichas.domain.contracts.teacher;

import java.util.UUID;

public interface DeleteTeacherDomainInterface {
    void execute(UUID teacherId);
}
