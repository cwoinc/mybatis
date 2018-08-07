package com.wantdo.mybatis.service;
import com.wantdo.mybatis.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public User getUserById(int userId);

    boolean addUser(User record);

}