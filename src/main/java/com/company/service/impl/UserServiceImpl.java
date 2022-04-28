package com.company.service.impl;

import com.company.dto.UserDTO;
import com.company.mapper.UserMapper;
import com.company.service.UserService;
import com.company.util.UserUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    UserUtil userUtil = new UserUtil();

    @Override
    public void creatUser(UserDTO user) {
        try {
            user.setCif(userUtil.cifGenerator());
            userMapper.creatUser(user);
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
    }

    @Override
    public void deleteUserByCif(String cif) {
        try {
            userMapper.deleteUser(cif);
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }

    }

    @Override
    public UserDTO getUserByCif(String cif) {
        try {
            return userMapper.getUser(cif);
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
        return null;
    }
}