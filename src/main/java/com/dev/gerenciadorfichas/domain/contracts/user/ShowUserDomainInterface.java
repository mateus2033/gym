package com.dev.gerenciadorfichas.domain.contracts.user;

import com.dev.gerenciadorfichas.domain.model.User;

public interface ShowUserDomainInterface {
    public User execute(String dataId);
}
