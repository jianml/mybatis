package cn.jianml.mybatis.service.impl;

import cn.jianml.mybatis.entity.User;
import cn.jianml.mybatis.mapper.UserMapper;
import cn.jianml.mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return userMapper.selectByUsernameAndPassword(username, password);
    }

    @Override
    public List<User> findByCondition(String username) {
        return userMapper.selectByCondition(username);
    }

}
