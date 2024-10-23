package com.dev.gerenciadorfichas.domain.services.user;

import com.dev.gerenciadorfichas.application.dto.UserInputDTO;
import com.dev.gerenciadorfichas.domain.contracts.user.CreateUserDomainInterface;
import com.dev.gerenciadorfichas.domain.dto.user.UserOutputDTO;
import com.dev.gerenciadorfichas.domain.mappers.user.UserMapper;
import com.dev.gerenciadorfichas.domain.model.User;
import com.dev.gerenciadorfichas.domain.repositories.UserRepository;
import com.dev.gerenciadorfichas.presentation.formRequest.user.CreateUserFormRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserDomainService implements CreateUserDomainInterface {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public UserOutputDTO execute(UserInputDTO userData) {
        User user = userMapper.toEntity(userData);
        userRepository.save(user);

        return new UserOutputDTO(
                user.getName(),
                user.getCpf(),
                user.getData_birth(),
                user.getCellphone(),
                user.getEmail()
        );
    }
}