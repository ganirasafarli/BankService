package com.company.mapper;

import com.company.dto.UserDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("Insert INTO ganira.users (name, surname , father_name, age, salary, cif)\n" + "VALUES (#{name}, #{surname} ,#{fatherName}, #{age} ,#{salary} ,#{cif})")
    void creatUser(UserDTO user);

//    @Delete("DELETE FROM ganira.users WHERE id=#{id}")
//    void deleteUser(int id);
}
