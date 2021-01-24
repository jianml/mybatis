package cn.jianml.mybatis.controller;

import cn.jianml.mybatis.entity.User;
import cn.jianml.mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("query")
    public User queryUserByUsernameAndPassword(String username, String password) {
        return userService.findByUsernameAndPassword(username, password);
    }

    @GetMapping("find")
    public List<User> queryUserByCondition(String username) {
        return userService.findByCondition(username);
    }
}
