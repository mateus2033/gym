package com.dev.gerenciadorfichas.domain.contracts.user;

import java.util.UUID;

public interface DeleteUserDomainInterface {
    public void execute(UUID dataId);
}
