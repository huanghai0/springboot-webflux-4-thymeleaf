package org.spring.springboot.service;

import org.spring.springboot.domain.User;

import java.util.List;

/**
 * 用户业务逻辑接口类
 */
public interface UserService {

    /**
     *
     * @return
     */
    List<User> findAllUser();

    User findUserByPhone(String phone);

    Long saveUser(User user);

    Long updateUser(User user);

    Long deleteUserByPhone(String phone);

}
