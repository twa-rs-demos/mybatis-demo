package com.tw.rs.dao;

import com.tw.rs.model.User;

import java.util.List;

/**
 * Created by zhyingjia on 16-10-14.
 */
public interface UserMapper {
     User getUserById(Integer id);
     List findAllUsers();
}
