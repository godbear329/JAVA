/*
 * Copyright (c) 2019.
 * All Rights Reserved,Designed By Mingyu Xiong
 */

package com.ychs.service.impl;

import com.ychs.bean.Page;
import com.ychs.bean.School;
import com.ychs.bean.User;
import com.ychs.mapper.SchoolMapper;
import com.ychs.mapper.UserMapper;
import com.ychs.service.UserService;
import com.ychs.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author Mingyu Xiong
 * @description:
 * @date 2019/12/24 10:13
 */
public class UserServiceImpl implements UserService {
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public int login(String username, String password) {
        sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.login(username, password);
        if (user == null) {
            return 0;
        } else {
            return 1;
        }
    }

}

