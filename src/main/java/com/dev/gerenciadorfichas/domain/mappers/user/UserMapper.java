package com.dev.gerenciadorfichas.domain.mappers.user;

import com.dev.gerenciadorfichas.application.dto.user.CreateUserInputDTO;
import com.dev.gerenciadorfichas.application.dto.user.UpdateUserInputDTO;
import com.dev.gerenciadorfichas.domain.model.User;
import com.dev.gerenciadorfichas.utils.date.DateUtil;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntityCreate(CreateUserInputDTO userData) {
        BCryptPasswordEncoder crypt = new BCryptPasswordEncoder();
        User user = new User();
        user.setName(userData.getName());
        user.setCpf(userData.getCpf());
        user.setData_birth(DateUtil.convertStringToDate(userData.getDataBirth()));
        user.setCellphone(userData.getCellphone());
        user.setEmail(userData.getEmail());
        user.setPassword(crypt.encode(userData.getPassword()));
        return user;
    }

    public User toEntityUpdate(UpdateUserInputDTO userData) {
        BCryptPasswordEncoder crypt = new BCryptPasswordEncoder();
        User user = new User();
        user.setId(userData.getId());
        user.setName(userData.getName());
        user.setCpf(userData.getCpf());
        user.setData_birth(DateUtil.convertStringToDate(userData.getDataBirth()));
        user.setCellphone(userData.getCellphone());
        user.setEmail(userData.getEmail());
        user.setPassword(userData.getPassword());
        return user;
    }
}
