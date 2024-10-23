package com.dev.gerenciadorfichas.domain.services.user;

import com.dev.gerenciadorfichas.domain.contracts.user.GetUserByEmailApplicationInterface;
import com.dev.gerenciadorfichas.domain.model.User;
import com.dev.gerenciadorfichas.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUserByEmailDomainService implements GetUserByEmailApplicationInterface {

    @Autowired
    private UserRepository userRepository;

    public User execute(String email) {
        return this.userRepository.findUserByEmail(email);
    }
}
