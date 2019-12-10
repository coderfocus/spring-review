package com.coderfocus.dao.impl;

import com.coderfocus.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    public String getName(){
        return "coderfocus";
    }
}
