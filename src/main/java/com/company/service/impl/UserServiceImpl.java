package com.company.service.impl;

import com.company.dto.UserDTO;
import com.company.mapper.UserMapper;
import com.company.mapper.UserMapper2;
import com.company.service.UserService;
import com.company.util.UserUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service

public class UserServiceImpl implements UserService {


    private final UserMapper userMapper;
    private final UserMapper2 userMapper2;
    private final UserUtil userUtil;


    public UserServiceImpl(UserMapper userMapper, UserMapper2 userMapper2, UserUtil userUtil) {
        this.userMapper = userMapper;
        this.userMapper2 = userMapper2;
        this.userUtil = userUtil;
    }


    @Override
    public void creatUser(UserDTO user) {
        log.info("User created :" + user);
        try {
            user.setCif(userUtil.cifGenerator());
            userMapper.creatUser(user);
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error(ex.getMessage());
        }

    }

    @Override
    public void deleteUserByCif(String cif) {
        log.info("the deletion of user by cif: +" + cif);
        try {
            userMapper.deleteUser(cif);
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error(ex.getMessage());
        }
    }

    @Override
    public UserDTO getUserByCif(String cif) {
        log.info("get user by cif:" + cif);
        try {
            return userMapper.getUser(cif);
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error(ex.getMessage());
        }
        return null;
    }

    @Override
    public void addDepositByCif(Double money, String cif) {
        log.info("add deposit process money:" + money + " and cif:" + cif);
        Double deposit = userMapper.getDepositByCif(cif);
        userMapper.updateDeposit(deposit + money, cif);
    }


    @Override
    public void addDepositByCif2(Double money, String cif) {
        log.info("add deposit process money:" + money + " and cif:" + cif);
        Long id = userMapper2.getIdByCif(cif);
        userMapper2.updateDepositById(id, money + userMapper2.getDepositById(id));
    }

}