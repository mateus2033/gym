package com.dev.gerenciadorfichas.application.services.user;

import com.dev.gerenciadorfichas.application.dto.user.UpdateUserInputDTO;
import com.dev.gerenciadorfichas.domain.contracts.user.UpdateUserApplicationInterface;
import com.dev.gerenciadorfichas.domain.dto.user.UpdateOutputDTO;
import com.dev.gerenciadorfichas.domain.model.User;
import com.dev.gerenciadorfichas.domain.services.user.ShowUserDomainService;
import com.dev.gerenciadorfichas.domain.services.user.UpdateUserDomainService;
import com.dev.gerenciadorfichas.exception.ResourceNotFoundException;
import com.dev.gerenciadorfichas.presentation.formRequest.user.UpdateUserFormRequest;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserApplicationService implements UpdateUserApplicationInterface {

    @Autowired
    private ShowUserDomainService showUserDomainService;

    @Autowired
    private UpdateUserDomainService updateUserDomainService;

    @Transactional
    public UpdateOutputDTO execute(UpdateUserFormRequest userData) {

        User user = showUserDomainService.execute(userData.getId());
        if (user == null) {
            throw new ResourceNotFoundException("User not found");
        }

        UpdateUserInputDTO userUpdate = new UpdateUserInputDTO(
                user.getId(),
                userData.getName(),
                user.getCpf(),
                userData.getData_birth(),
                userData.getCellphone(),
                user.getEmail()
        );

        return updateUserDomainService.execute(userUpdate);
    }
}
