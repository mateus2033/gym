package com.dev.gerenciadorfichas.domain.services.user;

import com.dev.gerenciadorfichas.domain.contracts.user.GetUserByCpfApplicationInterface;
import com.dev.gerenciadorfichas.domain.model.User;
import com.dev.gerenciadorfichas.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUserByCpfDomainService implements GetUserByCpfApplicationInterface {

    @Autowired
    private UserRepository userRepository;

    public User execute(String cpf) {
        return this.userRepository.findUserByCpf(cpf);
    }
}
