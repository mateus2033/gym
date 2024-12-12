package com.dev.gerenciadorfichas.domain.services.user;

import com.dev.gerenciadorfichas.application.dto.user.CreateUserInputDTO;
import com.dev.gerenciadorfichas.domain.contracts.user.CreateUserDomainInterface;
import com.dev.gerenciadorfichas.domain.dto.user.CreateOutputDTO;
import com.dev.gerenciadorfichas.domain.mappers.user.UserMapper;
import com.dev.gerenciadorfichas.domain.model.User;
import com.dev.gerenciadorfichas.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserDomainService implements CreateUserDomainInterface {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public CreateOutputDTO execute(CreateUserInputDTO userData) {
        User user = userMapper.toEntityCreate(userData);
        userRepository.save(user);

        return new CreateOutputDTO(
                user.getId(),
                user.getName(),
                user.getCpf(),
                user.getData_birth(),
                user.getCellphone(),
                user.getEmail()
        );
    }
}