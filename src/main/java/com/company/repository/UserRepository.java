package com.company.repository;

import com.company.dto.UserDTO;
import com.company.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    final UserMapper userMapper;

    public UserRepository(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserDTO creat() {
        return userMapper.creatUser();
    }
}
