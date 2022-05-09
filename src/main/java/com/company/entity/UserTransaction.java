package com.company.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users_transaction")
@Data
public class UserTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double deposit;

    private Double withdrawal;

//    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "id", referencedColumnName = "users_info_id")
//    private UserInfo users_info_id;

}
