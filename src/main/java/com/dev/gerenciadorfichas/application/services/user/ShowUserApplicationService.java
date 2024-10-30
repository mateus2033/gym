package com.dev.gerenciadorfichas.application.services.user;

import com.dev.gerenciadorfichas.application.contracts.user.ShowUserApplicationInterface;
import com.dev.gerenciadorfichas.domain.dto.user.ShowOutputDTO;
import com.dev.gerenciadorfichas.domain.model.User;
import com.dev.gerenciadorfichas.domain.services.user.ShowUserDomainService;
import com.dev.gerenciadorfichas.exception.ResourceNotFoundException;
import com.dev.gerenciadorfichas.presentation.formRequest.user.ShowUserFormRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowUserApplicationService implements ShowUserApplicationInterface {

     @Autowired
     private ShowUserDomainService showUserDomainService;

     public ShowOutputDTO execute(ShowUserFormRequest userData) {

         User user = showUserDomainService.execute(userData.getId());
         if (user == null) {
             throw new ResourceNotFoundException("User not found");
         }

         return new ShowOutputDTO(
           user.getId(),
           user.getName(),
           user.getCpf(),
           user.getData_birth(),
           user.getCellphone(),
           user.getEmail()
         );
     }
}
