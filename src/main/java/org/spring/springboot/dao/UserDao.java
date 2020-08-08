package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUser();

    /**
     * 根据城市 ID，获取城市信息
     *
     * @param phone
     * @return
     */
    User findByPhone(@Param("phone") String phone);

    Long saveUser(User user);

    Long updateUser(User user);

    Long deleteUser(String phone);
}
