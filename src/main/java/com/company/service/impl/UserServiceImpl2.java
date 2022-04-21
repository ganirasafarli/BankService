package com.company.service.impl;

import com.company.dto.UserDTO;
import com.company.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("user2")
public class UserServiceImpl2 implements UserService {
    @Override
    public UserDTO creatUser() {
        return null;
    }
}
