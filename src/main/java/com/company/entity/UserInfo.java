package com.company.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "users_info")
@Entity
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    @Column(name="father_name")
    private String fatherName;

    private Integer age;

    private Double salary;

    private String cif;

}
