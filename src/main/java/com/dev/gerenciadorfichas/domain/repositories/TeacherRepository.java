package com.dev.gerenciadorfichas.domain.repositories;

import java.util.UUID;
import com.dev.gerenciadorfichas.domain.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, UUID> {
}
