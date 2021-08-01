package com.hu.mapper;

import com.hu.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> getUsers() {
        SqlSession session = getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        return mapper.getUsers();
    }
}
