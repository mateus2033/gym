package com.dev.gerenciadorfichas.domain.repositories;

import java.util.UUID;
import com.dev.gerenciadorfichas.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<User, UUID> {
}
