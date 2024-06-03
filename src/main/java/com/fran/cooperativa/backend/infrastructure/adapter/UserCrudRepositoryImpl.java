package com.fran.cooperativa.backend.infrastructure.adapter;

import com.fran.cooperativa.backend.domain.model.User;
<<<<<<< HEAD
import com.fran.cooperativa.backend.domain.port.IUserRepository;
import com.fran.cooperativa.backend.infrastructure.mapper.UserMapper;
=======
import com.fran.cooperativa.backend.domain.model.UserNoRegister;
import com.fran.cooperativa.backend.domain.port.IUserRepository;
import com.fran.cooperativa.backend.infrastructure.mapper.UserMapper;
import jakarta.transaction.Transactional;
>>>>>>> 0c543862735b3f709f5ec07d73950f97ef2ac918
import org.springframework.stereotype.Repository;


@Repository
public class UserCrudRepositoryImpl implements IUserRepository {
    private final IUserCrudRepository iUserCrudRepository;
    private final UserMapper userMapper;

    public UserCrudRepositoryImpl(IUserCrudRepository iUserCrudRepository, UserMapper userMapper) {
        this.iUserCrudRepository = iUserCrudRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User save(User user) {
        return userMapper.toUser(iUserCrudRepository.save( userMapper.toUserEntity(user) ));
    }

    @Override
    public User findByEmail(String email) {
        return userMapper.toUser(iUserCrudRepository.findByEmail(email).orElseThrow(
                ()-> new RuntimeException ("User with email: "+email+ " not found")
        )   );
    }

    @Override
    public User findById(Integer id) {
        return  userMapper.toUser(iUserCrudRepository.findById(id).get());
    }
}

