package com.company.controller;

import com.company.dto.UserDTO;
import com.company.service.impl.UserServiceImpl;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.company.service.UserService;

@RestController
@RequestMapping("test/bank")
public class UserController {

  private   final UserService userService1;

  private   final UserService userService2;

    public UserController(@Qualifier("user1") UserService userService1, @Qualifier("user2") UserService userService2) {
        this.userService1 = userService1;
        this.userService2 = userService2;
    }

    @PostMapping("creat")
    public UserDTO creat(@RequestBody UserDTO user) {
        return userService1.creatUser();
    }
}
