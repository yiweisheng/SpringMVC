package com.yi.mapper;

import com.yi.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
    @Override
    public List<User> selectUser() {
        User user = new User(7, "小王", "12323");

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        int i = mapper.addUser(user);
        int i1 = mapper.deleteUser(7);

        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }
}
