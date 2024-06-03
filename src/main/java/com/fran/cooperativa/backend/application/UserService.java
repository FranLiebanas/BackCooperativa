package com.fran.cooperativa.backend.application;

import com.fran.cooperativa.backend.domain.model.User;
<<<<<<< HEAD
=======
import com.fran.cooperativa.backend.domain.model.UserNoRegister;
>>>>>>> 0c543862735b3f709f5ec07d73950f97ef2ac918
import com.fran.cooperativa.backend.domain.port.IUserRepository;

public class UserService {
    private final IUserRepository iUserRepository;

    public UserService(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    public User save (User user){
        return  this.iUserRepository.save(user);
    }

    public User findById (Integer id){
        return this.iUserRepository.findById(id);
    }

    public User findByEmail(String email){
        return iUserRepository.findByEmail(email);
    }

}
