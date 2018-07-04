package com.huixiaoer.springboot.pojo;

import com.huixiaoer.springboot.validator.ValidGroup1;
import com.huixiaoer.springboot.validator.ValidGroup2;

import javax.validation.constraints.NotNull;

public class User {
    @NotNull(groups = {ValidGroup1.class})
    @NotNull(groups = {ValidGroup2.class})
    private Long id;
    private String username;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
