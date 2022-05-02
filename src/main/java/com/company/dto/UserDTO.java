package com.company.dto;

import lombok.Data;

@Data
public class UserDTO {

    private Long id;
    private String name;
    private String surname;
    private String fatherName;
    private Integer age;
    private double salary;
    private String cif;
    private Double withdrawal;
    private Double deposit;
}