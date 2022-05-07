package com.company.service;

import com.company.dto.UserDTO;

public interface UserService {

    void saveUser(UserDTO user);

    void deleteUserByCif(String cif);

    UserDTO findUserByCif(String cif);

    void addDepositByCif(Double money, String cif);

//    void addDepositByCif2(Double money, String cif);

    void withdrawMoneyByCif(Double money, String cif);
}
