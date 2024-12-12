package com.dev.gerenciadorfichas.application.services.user;

import com.dev.gerenciadorfichas.application.contracts.user.CreteUserApplicationInterface;
import com.dev.gerenciadorfichas.application.dto.user.CreateUserInputDTO;
import com.dev.gerenciadorfichas.domain.dto.user.CreateOutputDTO;
import com.dev.gerenciadorfichas.domain.model.User;
import com.dev.gerenciadorfichas.domain.services.user.CreateUserDomainService;
import com.dev.gerenciadorfichas.domain.services.user.GetUserByCpfDomainService;
import com.dev.gerenciadorfichas.domain.services.user.GetUserByEmailDomainService;
import com.dev.gerenciadorfichas.exception.ResourceAlreadyExistsException;
import com.dev.gerenciadorfichas.presentation.formRequest.user.CreateUserFormRequest;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserApplicationService implements CreteUserApplicationInterface {

    @Autowired
    private CreateUserDomainService createUserService;

    @Autowired
    private GetUserByCpfDomainService getUserByCpfService;

    @Autowired
    private GetUserByEmailDomainService getUserByEmailService;

    @Transactional
    public CreateOutputDTO execute(CreateUserFormRequest userdata) {
        User email = this.getUserByEmailService.execute(userdata.getEmail());
        if (email != null) {
            throw new ResourceAlreadyExistsException("Email already registered");
        }

        User cpf = this.getUserByCpfService.execute(userdata.getCpf());
        if (cpf != null) {
            throw new ResourceAlreadyExistsException("CPF already registered");
        }

        CreateUserInputDTO user = new CreateUserInputDTO(
                userdata.getName(),
                userdata.getCpf(),
                userdata.getData_birth(),
                userdata.getCellphone(),
                userdata.getEmail(),
                userdata.getPassword()
        );

        return this.createUserService.execute(user);
    }
}
