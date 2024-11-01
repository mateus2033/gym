package com.dev.gerenciadorfichas.domain.services.user;

import com.dev.gerenciadorfichas.application.dto.user.UpdateUserInputDTO;
import com.dev.gerenciadorfichas.domain.dto.user.UpdateOutputDTO;
import com.dev.gerenciadorfichas.domain.mappers.user.UserMapper;
import com.dev.gerenciadorfichas.domain.model.User;
import com.dev.gerenciadorfichas.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserDomainService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public UpdateOutputDTO execute(UpdateUserInputDTO userData) {
        User user = userMapper.toEntityUpdate(userData);
        userRepository.updateUser(
                user.getId(),
                user.getName(),
                user.getData_birth(),
                user.getCellphone()
        );

        return new UpdateOutputDTO(
                user.getId(),
                user.getName(),
                user.getCpf(),
                user.getData_birth(),
                user.getCellphone(),
                user.getEmail()
        );
    }
}
