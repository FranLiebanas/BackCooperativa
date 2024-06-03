package com.fran.cooperativa.backend.domain.port;

import com.fran.cooperativa.backend.domain.model.User;
<<<<<<< HEAD
=======
import com.fran.cooperativa.backend.domain.model.UserNoRegister;
>>>>>>> 0c543862735b3f709f5ec07d73950f97ef2ac918

public interface IUserRepository {
    User save(User user);
    User findByEmail(String email);
    User findById(Integer id);
}