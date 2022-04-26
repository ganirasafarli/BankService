package com.company.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class UserDTO {

    private String name;
    private String surname;
    private String fatherName;
    private int age;
    private double salary;
    private String cif;
}