package com.company.mapper;

import com.company.dto.UserDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("Insert INTO users_main (id,name, surname , father_name, age, salary, cif,withdrawal , deposit)\n" + "VALUES (#{id},#{name}, #{surname} ,#{fatherName}, #{age} ,#{salary} ,#{cif},#{withdrawal},#{deposit})")
    void creatUser(UserDTO user);

    @Delete("DELETE FROM users_main WHERE cif=#{cif}")
    void deleteUser(String cif);

    @Select("Select * from users_main where cif=#{cif}")
    UserDTO getUser(String cif);

}
