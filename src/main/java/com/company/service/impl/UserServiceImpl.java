package com.company.service.impl;

import com.company.dto.UserDTO;
import com.company.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.company.repository.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("user1")

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    public UserDTO creatUser() {
        return userRepository.creat();
    }
}