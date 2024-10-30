package com.dev.gerenciadorfichas.application.services.user;

import com.dev.gerenciadorfichas.application.contracts.user.DeleteUserApplicationInterface;
import com.dev.gerenciadorfichas.domain.dto.user.DeleteOutputDTO;
import com.dev.gerenciadorfichas.domain.model.User;
import com.dev.gerenciadorfichas.domain.services.user.DeleteUserDomainService;
import com.dev.gerenciadorfichas.domain.services.user.ShowUserDomainService;
import com.dev.gerenciadorfichas.exception.ResourceNotFoundException;
import com.dev.gerenciadorfichas.presentation.formRequest.user.DeleteUserFormRequest;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserApplicationService implements DeleteUserApplicationInterface {

    @Autowired
    private ShowUserDomainService showUserDomainService;

    @Autowired
    private DeleteUserDomainService deleteUserDomainService;

    @Transactional
    public DeleteOutputDTO execute(DeleteUserFormRequest userData) {
        User user = showUserDomainService.execute(userData.getId());

        if (user == null) {
            throw new ResourceNotFoundException("User not found");
        }

        deleteUserDomainService.execute(user.getId());
        return new DeleteOutputDTO("User deleted successfully.");
    }
}
