package cn.jianml.mybatis.service;

import cn.jianml.mybatis.entity.User;

import java.util.List;

public interface IUserService {
    User findByUsernameAndPassword(String username, String password);

    List<User> findByCondition(String username);
}
