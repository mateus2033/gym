package com.dev.gerenciadorfichas.domain.repositories;

import com.dev.gerenciadorfichas.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    User findUserByCpf(String cpf);
    User findUserByEmail(String email);
}
