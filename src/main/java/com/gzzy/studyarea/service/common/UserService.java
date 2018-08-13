package com.gzzy.studyarea.service.common;

import com.gzzy.studyarea.dao.common.UserDao;
import com.gzzy.studyarea.entity.common.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> queryUser() {
        List<User> users =  userDao.querUser();
        return users;

    }
}
