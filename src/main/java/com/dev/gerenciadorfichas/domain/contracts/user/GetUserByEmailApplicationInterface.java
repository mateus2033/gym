package com.dev.gerenciadorfichas.domain.contracts.user;

import com.dev.gerenciadorfichas.domain.model.User;

public interface GetUserByEmailApplicationInterface {
    public User execute(String email);
}
