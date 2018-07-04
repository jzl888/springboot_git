package com.huixiaoer.springboot.service.impl;

import com.huixiaoer.springboot.pojo.User;
import com.huixiaoer.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;


    @Test
    public void insertUser() {
        User user = new User();
        user.setId(2L);
        user.setUsername("贾肇林");
        user.setAge(28);
        userService.insertUser(user);
    }

    @Test
    public void selectAllUser() {
        List<User> users = userService.selectAllUser();
        for (User user : users){
            System.out.println(user.getUsername());

        }
    }
}