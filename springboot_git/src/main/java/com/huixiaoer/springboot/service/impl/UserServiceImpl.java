package com.huixiaoer.springboot.service.impl;

import com.huixiaoer.springboot.mapper.UserMapper;
import com.huixiaoer.springboot.pojo.User;
import com.huixiaoer.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }
}
