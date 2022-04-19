package com.company.mapper;

import com.company.dto.UserDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("Insert INTO user (name, surname,salary)\n" + "VALUES #{name}, #{surname} ,#{salary}")
    UserDTO creatUser();

}
