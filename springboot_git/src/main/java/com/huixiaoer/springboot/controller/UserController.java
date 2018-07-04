package com.huixiaoer.springboot.controller;

import com.huixiaoer.springboot.common.Result;
import com.huixiaoer.springboot.common.ResultGenerator;
import com.huixiaoer.springboot.mapper.UserMapper;
import com.huixiaoer.springboot.pojo.User;
import com.huixiaoer.springboot.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @ApiOperation(value="创建用户", notes="根据传入的id创建用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "request", value = "用户的请求",required = true,dataType = "HttpServletRequest"),
            @ApiImplicitParam(name = "id", value = "用户的id",required = true,dataType = "Longs")

    })
    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET, produces = "application/json")
    public Result getUserDetail(HttpServletRequest request, @PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername("lifei");
        user.setAge(28);
        return ResultGenerator.genSuccessResult(request.getRequestURL(), user);
    }

    @ApiOperation(value="创建用户", notes="创建用户")
    @ApiImplicitParam(name = "request", value = "用户的请求",required = true,dataType = "HttpServletRequest" )
    @RequestMapping(value = "/detail/save", method = RequestMethod.GET, produces = "application/json")
    public Result saveUser(HttpServletRequest request) {
        User user = new User();
        user.setId(3L);
        user.setUsername("贾肇林");
        user.setAge(28);
        userService.insertUser(user);
        logger.info("保存成功");
        return ResultGenerator.genSuccessResult(request.getRequestURL(), user);
    }

    @RequestMapping(value = "/detail/findAll", method = RequestMethod.GET, produces = "application/json")
    @ApiImplicitParam(name = "request", value = "用户的请求",required = true,dataType = "HttpServletRequest" )
    public Result findAll(HttpServletRequest request) {

        List<User> users = userService.selectAllUser();
        logger.info("查询成功");
        return ResultGenerator.genSuccessResult(request.getRequestURL(), users);
    }

}
