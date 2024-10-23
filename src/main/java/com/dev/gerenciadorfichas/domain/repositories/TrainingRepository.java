package com.dev.gerenciadorfichas.domain.repositories;

import com.dev.gerenciadorfichas.domain.model.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TrainingRepository extends JpaRepository<Training, UUID> {
}
