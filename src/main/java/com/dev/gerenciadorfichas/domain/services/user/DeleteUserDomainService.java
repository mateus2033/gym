package com.dev.gerenciadorfichas.domain.services.user;

import com.dev.gerenciadorfichas.domain.contracts.user.DeleteUserDomainInterface;
import com.dev.gerenciadorfichas.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class DeleteUserDomainService implements DeleteUserDomainInterface {

    @Autowired
    private UserRepository userRepository;

    public void execute(UUID userId) {
        userRepository.deleteById(userId);
    }
}
