package com.company.service;

import com.company.dto.UserDTO;
import com.company.exception.MyException;

public interface UserService {

    void saveUser(UserDTO user);

    void deleteUserByCif(String cif);

    UserDTO findUserByCif(String cif) throws RuntimeException;

//    void addDepositByCif(Double money, String cif);

//    void addDepositByCif2(Double money, String cif);

//    void withdrawMoneyByCif(Double money, String cif);
}
