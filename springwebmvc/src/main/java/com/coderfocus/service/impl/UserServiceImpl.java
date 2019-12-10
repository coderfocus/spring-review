package com.coderfocus.service.impl;

import com.coderfocus.dao.UserDao;
import com.coderfocus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public String getName() {
        return userDao.getName();
    }
}
