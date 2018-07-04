package com.huixiaoer.springboot.service;

import com.huixiaoer.springboot.pojo.User;

import java.util.List;

public interface UserService {

    public void insertUser(User user);

    public List<User> selectAllUser();
}
