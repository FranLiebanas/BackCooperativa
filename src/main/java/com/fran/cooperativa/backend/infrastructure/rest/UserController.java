package com.fran.cooperativa.backend.infrastructure.rest;

import com.fran.cooperativa.backend.application.UserService;
import com.fran.cooperativa.backend.domain.model.User;
<<<<<<< HEAD
=======
import com.fran.cooperativa.backend.domain.model.UserNoRegister;
import lombok.extern.slf4j.Slf4j;
>>>>>>> 0c543862735b3f709f5ec07d73950f97ef2ac918
import org.springframework.web.bind.annotation.*;

@RestController
//http://localhost:8081
@RequestMapping("/api/users")
//http://localhost:8085/api/users
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    //http://localhost:8085/api/v1/users/4
    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){
        return userService.findById(id);
    }
}

