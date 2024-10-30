package com.dev.gerenciadorfichas.domain.contracts.user;

import com.dev.gerenciadorfichas.domain.dto.user.UpdateOutputDTO;
import com.dev.gerenciadorfichas.presentation.formRequest.user.UpdateUserFormRequest;

public interface UpdateUserApplicationInterface {
    public UpdateOutputDTO execute(UpdateUserFormRequest userUpdate);
}
