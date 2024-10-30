package com.dev.gerenciadorfichas.application.contracts.user;

import com.dev.gerenciadorfichas.domain.dto.user.DeleteOutputDTO;
import com.dev.gerenciadorfichas.presentation.formRequest.user.DeleteUserFormRequest;

public interface DeleteUserApplicationInterface {
    public DeleteOutputDTO execute(DeleteUserFormRequest userData);
}
