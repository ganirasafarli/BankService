package com.company.controller;

import com.company.dto.UserDTO;
import com.company.exception.MyException;
import com.company.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test/bank")
@RequiredArgsConstructor
public class UserInfoController {

    private final UserService userService;

    @PostMapping("registration")
    public void save(@RequestBody UserDTO user) {
        userService.saveUser(user);
    }

    @DeleteMapping("{cif}")
    public void delete(@PathVariable String cif) {
        userService.deleteUserByCif(cif);
    }

    @GetMapping("user/{cif}")
    public ResponseEntity<UserDTO> get(@PathVariable String cif) throws RuntimeException {
        return ResponseEntity.ok(userService.findUserByCif(cif));
    }

//    @PostMapping("money")
//    public void addMoney(@RequestParam Double money, @RequestParam String cif) {
//        userService.addDepositByCif(money, cif);
//    }

//    @PostMapping("money2/{money}/{cif}")
//    public void withdrawMoney(@PathVariable Double money, @PathVariable String cif) {
//        userService.withdrawMoneyByCif(money, cif);
//}
}