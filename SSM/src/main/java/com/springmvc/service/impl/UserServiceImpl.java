package com.springmvc.service.impl;

import com.springmvc.dal.mapper.UserMapper;
import com.springmvc.dal.model.User;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: UserServiceImpl
 * @Auther: zhengchen
 * @Date: 2019/3/29 16:01
 * @Description:
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public User getByUserName(String userName) {
        return userMapper.getByUserName(userName);
    }

    public User getByUserId(Long id) {
        return userMapper.getByUserId(id);
    }

    public Boolean insertUser(User user) {
        return userMapper.insertUser(user);
    }

}
