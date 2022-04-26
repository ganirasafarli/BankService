package com.company.service.impl;

import com.company.dto.UserDTO;
import com.company.mapper.UserMapper;
import com.company.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service("user1")

public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    Random random = new Random();

    public String cifGenerator() {
        int maximum = 9999999;
        int minimum = 1000000;
        return String.valueOf(random.nextInt(maximum - minimum + 1) + minimum);
    }

    @Override
    public void creatUser(UserDTO user) {
        user.setCif(cifGenerator());
        userMapper.creatUser(user);
    }

}