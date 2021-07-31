package com.hu.mapper;

import com.hu.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    List<User> getUsers();
}
