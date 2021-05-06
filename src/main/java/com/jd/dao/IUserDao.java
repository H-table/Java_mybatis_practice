package com.jd.dao;

import com.jd.entity.User;

import java.util.List;

/**
 * Created by HXS on 2021/4/25.
 *
 * 用户的持久层接口
        */
public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();
}
