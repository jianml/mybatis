package cn.jianml.mybatis.mapper;

import cn.jianml.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    User selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    List<User> selectByCondition(@Param("username") String username);
}
