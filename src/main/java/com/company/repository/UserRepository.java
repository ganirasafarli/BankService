package com.company.repository;

import com.company.entity.UserInfo;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserInfo, Long> {


    @Query(name = "DELETE FROM users_info WHERE cif =: cif", nativeQuery = true)
    void deleteUserByCif(String cif);

    @Query(name = "Select * from users_info where cif=: cif")
    UserInfo findUserByCif(String cif);

    Double findDepositByCif(String cif);


    @Query(name = "Update ui.deposit users_transaction ut inner join users_info ui on ut.id=ui.users_info_id set ut.deposit=:deposit where cif=: cif")
    void updateDeposit(Double deposit, String cif);


    @Query(name = "SELECT  ui.withdrawal from users_transaction ui inner join users_info ui on ui.id=ui.users_info_id where cif=: cif")
    Double findWithdrawalByCif(String cif);

    @Query(name = "update users_info ui inner join users_transaction ut on ui.users_info_id = ut.id set withdrawal= : withdrawal where cif=: cif")
    void updateWithdrawal(Double withdrawal, String cif);

}
