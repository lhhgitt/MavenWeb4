package com.lihui.serviceImpl;

import com.lihui.mapper.UserMapper;
import com.lihui.pojo.User;
import com.lihui.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
