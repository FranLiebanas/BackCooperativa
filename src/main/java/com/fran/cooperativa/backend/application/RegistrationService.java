package com.fran.cooperativa.backend.application;

import com.fran.cooperativa.backend.domain.model.User;
import com.fran.cooperativa.backend.domain.port.IUserRepository;

public class RegistrationService {
    private final IUserRepository iUserRepository;

    public RegistrationService(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    public User register (User user){
        return iUserRepository.save(user);
    }
}
