package org.spring.springboot.service.impl;

import org.spring.springboot.dao.UserDao;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务逻辑实现类
 */
@Service

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public User findUserByPhone(String phone) {
        return userDao.findByPhone(phone);
    }

    @Override
    public Long saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public Long updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public Long deleteUserByPhone(String phone) {
        return userDao.deleteUser(phone);
    }
}
