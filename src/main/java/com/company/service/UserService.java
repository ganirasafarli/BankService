package com.company.service;

import com.company.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDTO creatUser();
}
