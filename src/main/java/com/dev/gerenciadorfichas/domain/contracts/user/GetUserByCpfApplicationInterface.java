package com.dev.gerenciadorfichas.domain.contracts.user;

import com.dev.gerenciadorfichas.domain.model.User;

public interface GetUserByCpfApplicationInterface {
    public User execute(String cpf);
}
