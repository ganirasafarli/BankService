package com.company.controller;

import com.company.dto.UserDTO;
import com.company.service.impl.UserServiceImpl;

import org.springframework.web.bind.annotation.*;
import com.company.service.UserService;

@RestController
@RequestMapping("test/bank")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("creat")
    public void creat(@RequestBody UserDTO user) {
        userService.creatUser(user);
    }


}
