package com.springmvc.dal.mapper;


import com.springmvc.dal.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getByUserName(String userName);

    User getByUserId(Long id);

    Boolean insertUser(User user);

}
