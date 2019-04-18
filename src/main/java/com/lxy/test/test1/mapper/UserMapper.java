package com.lxy.test.test1.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    @Insert("insert into user(username,password) values(#{username},#{password})")
    public int save(@Param("username") String username, @Param("password") String password);


}
