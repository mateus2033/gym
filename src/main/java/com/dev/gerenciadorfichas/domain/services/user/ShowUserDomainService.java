package com.dev.gerenciadorfichas.domain.services.user;

import com.dev.gerenciadorfichas.domain.contracts.user.ShowUserDomainInterface;
import com.dev.gerenciadorfichas.domain.model.User;
import com.dev.gerenciadorfichas.domain.repositories.UserRepository;
import com.dev.gerenciadorfichas.utils.uuid.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class ShowUserDomainService implements ShowUserDomainInterface {

    @Autowired
    private UserRepository userRepository;

    public User execute(String dataId) {
        UUID id = UuidUtil.convertStringToUUID(dataId);
        return userRepository.findUserById(id);
    }
}
