package com.company.mapper;

import com.company.dto.UserDTO;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Insert("Insert INTO users_main (id, name, surname , father_name, age, salary, cif,withdrawal , deposit)\n" + "VALUES (#{id},#{name}, #{surname} ,#{fatherName}, #{age} ,#{salary} ,#{cif},#{withdrawal},#{deposit})")
    void creatUser(UserDTO user);

    @Delete("DELETE FROM users_main WHERE cif=#{cif}")
    void deleteUser(String cif);

    @Select("Select * from users_main where cif=#{cif}")
    UserDTO getUser(String cif);

    @Select("Select id from user where cif=#{cif}")
    Integer selectIdByCif(String cif);

    @Update("update users_info ui inner join users_main um on ui.users_main_id = um.id" + " set ui.deposit=#{deposit} where cif = #{cif}")
    void updateDeposit(Double deposit, String cif);

    @Select("SELECT ui.deposit\n" + "from users_info ui\n" + " inner join users_main um on um.id = ui.users_main_id\n" + "where um.cif=#{cif};")
    Double getDepositByCif(String cif);
}
