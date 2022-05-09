package com.company.service.impl;

import com.company.dto.UserDTO;
import com.company.entity.UserInfo;
import com.company.repository.UserRepository;
import com.company.service.UserService;
import com.company.util.UserUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    ModelMapper modelMapper = new ModelMapper();


    @Override
    public void saveUser(UserDTO userDTO) {
        userDTO.setCif(UserUtil.cifGenerator());
        UserInfo user = modelMapper.map(userDTO, UserInfo.class);
        userRepository.save(user);
    }

    @Override
    public void deleteUserByCif(String cif) {
        log.info("the deletion of user by cif: {}", cif);
        try {
            userRepository.deleteUserByCif(cif);
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error(ex.getMessage());
        }
    }

    @Override
    public UserDTO findUserByCif(String cif) throws RuntimeException {
        log.info("find user by cif {}", cif);
        UserInfo userInfo = userRepository.findUserByCif(cif);
        if (userInfo == null) {
            throw new RuntimeException("There is no user matching this cif.");
        }
        UserDTO userDTO = modelMapper.map(userInfo, UserDTO.class);
        return userDTO;
    }

//    @Override
//    public void addDepositByCif(Double money, String cif) {
//        log.info("add deposit process money:" + money + " and cif:" + cif);
//        Double currentDeposit = userRepository.findDepositByCif(cif);
//        userRepository.updateDeposit(currentDeposit + money, cif);
//    }


//    @Override
//    public void addDepositByCif2(Double money, String cif) {
//        log.info("add deposit process money:" + money + " and cif:" + cif);
//        Long id = userRepository2.findIdByCif(cif);
//        Double lastDeposit = userRepository2.findDepositById(id);
//        userRepository2.updateDepositById(id, money + lastDeposit);
//    }


//    @Override
//    public void withdrawMoneyByCif(Double money, String cif) {
//        log.info("Withdrawal");
//        Double currentWithdrawal = userRepository.findWithdrawalByCif(cif);
//        userRepository.updateWithdrawal(currentWithdrawal + money, cif);
//    }
}