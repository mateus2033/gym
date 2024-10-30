package com.dev.gerenciadorfichas.application.contracts.user;

import com.dev.gerenciadorfichas.domain.dto.user.CreateOutputDTO;
import com.dev.gerenciadorfichas.presentation.formRequest.user.CreateUserFormRequest;

public interface CreteUserApplicationInterface {
    public CreateOutputDTO execute(CreateUserFormRequest userdata);
}
