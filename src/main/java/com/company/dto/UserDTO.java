package com.company.dto;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Getter
public class UserDTO {

    private Long id;
    private String name;
    private String surname;
    private String fatherName;
    private int age;
    private double salary;
    private String cif;
}