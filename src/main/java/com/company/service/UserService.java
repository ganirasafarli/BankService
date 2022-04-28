package com.company.service;

import com.company.dto.UserDTO;
import org.springframework.stereotype.Service;


public interface UserService {
    void creatUser(UserDTO user);

    void deleteUserByCif(String cif);

    UserDTO getUserByCif(String cif);
}
