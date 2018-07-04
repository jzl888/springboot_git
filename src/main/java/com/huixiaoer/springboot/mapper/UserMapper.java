package com.huixiaoer.springboot.mapper;

import com.huixiaoer.springboot.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    public void insertUser(User user);

    public List<User> selectAllUser();
}
