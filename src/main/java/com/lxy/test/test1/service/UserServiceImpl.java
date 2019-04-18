package com.lxy.test.test1.service;

import com.lxy.test.test1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl{
    @Autowired//自动注入相关的值
    private UserMapper userMapper;

    public void register(String username, String password) {
        userMapper.save(username, password);
    }
}
