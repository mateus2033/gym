package com.dev.gerenciadorfichas.domain.repositories;

import java.util.Date;
import java.util.UUID;
import com.dev.gerenciadorfichas.domain.model.Teacher;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, UUID> {
    Teacher findTeacherById(UUID id);
    Teacher findTeacherByCpf(String cpf);
    Teacher findTeacherByEmail(String email);
    Teacher findTeacherByRegistration(Integer registration);

    @Transactional
    @Modifying
    @Query("UPDATE Teacher u SET u.name = :name, u.cellphone = :cellphone , u.cpf = :cpf, u.email = :email WHERE u.id = :id")
    void updateTeacher(UUID id, String name, String cellphone, String cpf, String email);
}
