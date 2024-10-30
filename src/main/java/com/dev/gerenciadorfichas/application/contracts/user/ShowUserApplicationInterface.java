package com.dev.gerenciadorfichas.application.contracts.user;

import com.dev.gerenciadorfichas.domain.dto.user.ShowOutputDTO;
import com.dev.gerenciadorfichas.presentation.formRequest.user.ShowUserFormRequest;

public interface ShowUserApplicationInterface {
    public ShowOutputDTO execute(ShowUserFormRequest userData);
}
