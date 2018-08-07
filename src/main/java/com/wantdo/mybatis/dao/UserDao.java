package com.wantdo.mybatis.dao;

//import com.xdd.entity.User;

import com.wantdo.mybatis.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
