package com.company.service;

import com.company.dto.UserDTO;

public interface UserService {

    void creatUser(UserDTO user);

    void deleteUserByCif(String cif);

    UserDTO getUserByCif(String cif);

    void addDepositByCif(Double money, String cif);

    void addDepositByCif2(Double money, String cif);
}
