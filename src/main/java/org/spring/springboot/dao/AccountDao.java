package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Account;

public interface AccountDao {

    Account login(@Param("aid") String aid, @Param("apwd") String apwd);
}
