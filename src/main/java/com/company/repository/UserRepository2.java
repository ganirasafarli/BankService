package com.company.repository;

import com.company.entity.UserTransaction;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository2 extends JpaRepository<UserTransaction, Long> {

}
