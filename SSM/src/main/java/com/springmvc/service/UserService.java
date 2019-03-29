package com.springmvc.service;

import com.springmvc.dal.model.User;

/**
 * @ClassName: UserService
 * @Auther: zhengchen
 * @Date: 2019/3/29 16:01
 * @Description:
 */
public interface UserService {
    User getByUserName(String userName);

    User getByUserId(Long id);

    Boolean insertUser(User user);
}
