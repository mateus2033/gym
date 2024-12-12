package com.dev.gerenciadorfichas.domain.mappers.teacher;


import com.dev.gerenciadorfichas.application.dto.teacher.CreateTeacherInputDTO;
import com.dev.gerenciadorfichas.application.dto.teacher.UpdateTeacherInputDTO;
import com.dev.gerenciadorfichas.domain.model.Teacher;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapper {
    public Teacher toEntityCreate(CreateTeacherInputDTO teacherData) {
        BCryptPasswordEncoder crypt = new BCryptPasswordEncoder();
        Teacher teacher = new Teacher();
        teacher.setName(teacherData.getName());
        teacher.setCpf(teacherData.getCpf());
        teacher.setRegistration(teacherData.getRegistration());
        teacher.setCellphone(teacherData.getCellphone());
        teacher.setEmail(teacherData.getEmail());
        teacher.setPassword(crypt.encode(teacherData.getPassword()));
        return teacher;
    }

    public Teacher toEntityUpdate(UpdateTeacherInputDTO teacherData) {
        Teacher teacher = new Teacher();
        teacher.setId(teacherData.getId());
        teacher.setName(teacherData.getName());
        teacher.setCellphone(teacherData.getCellphone());
        teacher.setCpf(teacherData.getCpf());
        teacher.setEmail(teacherData.getEmail());
        return teacher;
    }
}
