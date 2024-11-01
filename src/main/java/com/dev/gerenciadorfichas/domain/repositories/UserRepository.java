package com.dev.gerenciadorfichas.domain.repositories;

import com.dev.gerenciadorfichas.domain.model.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    User findUserById(UUID cpf);
    User findUserByCpf(String cpf);
    User findUserByEmail(String email);

    @Transactional
    @Modifying
    @Query("UPDATE User u SET u.name = :name, u.data_birth = :data_birth, u.cellphone = :cellphone WHERE u.id = :id")
    void updateUser(UUID id, String name, Date data_birth, String cellphone);
}
