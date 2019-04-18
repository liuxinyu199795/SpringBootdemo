package com.lxy.test.test2.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {

    @Insert("insert into customer(name,tel) values(#{name},#{tel})")
    public int save(@Param("name") String name, @Param("tel") String tel);

}
