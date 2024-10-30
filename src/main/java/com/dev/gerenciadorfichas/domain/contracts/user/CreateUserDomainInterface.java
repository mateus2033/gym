package com.dev.gerenciadorfichas.domain.contracts.user;

import com.dev.gerenciadorfichas.application.dto.user.CreateUserInputDTO;
import com.dev.gerenciadorfichas.domain.dto.user.CreateOutputDTO;

public interface CreateUserDomainInterface {
    public CreateOutputDTO execute(CreateUserInputDTO userData);
}
