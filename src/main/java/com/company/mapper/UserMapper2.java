package com.company.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper2 {

    @Select("Select id from users_main where cif=#{cif}")
    Long getIdByCif(String cif);


    @Select("Select deposit from users_info where users_main_id = #{id}")
    Double getDepositById(Long id);


    @Update("update users_info set deposit = #{deposit} where users_main_id=#{id}")
    void updateDepositById(Long id, Double deposit);
}
