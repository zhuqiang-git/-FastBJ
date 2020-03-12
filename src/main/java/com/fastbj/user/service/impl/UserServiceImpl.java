package com.fastbj.user.service.impl;

import com.fastbj.user.dao.userMapper;
import com.fastbj.user.model.User;
import com.fastbj.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private userMapper userMapper;



    @Override
    public int insert(User userInfo) {
        int result=0;
        userMapper.insert(userInfo);
        result=1;
        return result;
    }
}
