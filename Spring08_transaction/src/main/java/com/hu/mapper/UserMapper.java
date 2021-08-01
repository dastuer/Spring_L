package com.hu.mapper;

import com.hu.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from mybatis.user")
    List<User> getUsers();
    @Insert("insert into mybatis.user(id,name,pwd) " +
            "values(#{id},#{name},#{pwd})")
    int addUser(User user);
    @Delete("delete from mybatis.user where id=#{id}")
    int delUserById(String id);

}
