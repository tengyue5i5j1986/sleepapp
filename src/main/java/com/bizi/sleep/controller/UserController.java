package com.bizi.sleep.controller;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Date;
import java.util.List;
import com.bizi.sleep.domain.User;
import com.bizi.sleep.service.UserService;


@Api(description = "用户模块")
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    private  final Logger logger = LoggerFactory.getLogger(UserController.class);


    // 查询
    @ApiOperation(value="获取用户信息",notes="注意问题点")
    @GetMapping("/find")
    public List<User> findAll(){
        System.out.println("测试中文");
        logger.info("name 为: {}","tengyue");
        System.out.println(DateUtil.format(new Date(), "yyyy年MM月dd日"));
        return userService.findAll();
    }
    // 添加
    @ApiOperation(value="添加用户信息",notes="注意问题点")
    @PostMapping("/insert")
    public void Insert(@RequestBody  User user){
         userService.Insert(user);
    }
    
    // 更新
    @ApiOperation(value="更新用户信息",notes="根据用户id")
    @PutMapping("/update")
    public void Update(@RequestBody User user){
        userService.Update(user);
    }

    // 删除
    @ApiOperation(value="删除用户信息",notes="根据用户id")
    @DeleteMapping("/delete")
    public void Delete(@RequestParam("id") int id){
        userService.Delete(id);
    }
}