package com.zrs.service.impl;

import com.zrs.bean.User;
import com.zrs.dao.UserDao;
import com.zrs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service //给业务逻辑层生成对象
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
