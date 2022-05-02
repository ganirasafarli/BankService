package com.company.controller;

import com.company.dto.UserDTO;
import com.company.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test/bank")
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    @PostMapping("registration")
    public void creat(@RequestBody UserDTO user) {
        userService.creatUser(user);
    }

    @DeleteMapping("{cif}")
    public void delete(@PathVariable String cif) {
        userService.deleteUserByCif(cif);
    }

    @GetMapping("user/{cif}")
    public UserDTO get(@PathVariable String cif) {
        return userService.getUserByCif(cif);
    }

    @PostMapping("money/{money}/{cif}")
    public void addMoney(@PathVariable Double money, @PathVariable String cif) {
        userService.addDepositByCif2(money, cif);
    }


}