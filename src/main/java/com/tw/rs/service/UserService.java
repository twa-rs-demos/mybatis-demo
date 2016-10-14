package com.tw.rs.service;

import com.tw.rs.dao.UserMapper;
import com.tw.rs.model.User;
import com.tw.rs.util.JDBCUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by zhyingjia on 16-10-14.
 */
public class UserService {

    public List findAllUsers(){
        SqlSession session = JDBCUtil.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List users = userMapper.findAllUsers();

        JDBCUtil.colseSession(session);
        return users;
    }

    public User getUserById(Integer id){
        SqlSession session = JDBCUtil.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.getUserById(id);
        JDBCUtil.colseSession(session);
        return user;
    }

}
