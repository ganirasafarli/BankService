package com.company.controller;

import com.company.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.company.service.UserService;

@RestController
@RequestMapping("test/bank")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("creat")
    public UserDTO creat(@RequestBody UserDTO user) {
        return userService.creatUser();
    }
}
