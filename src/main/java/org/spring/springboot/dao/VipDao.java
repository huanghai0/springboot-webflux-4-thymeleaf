package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Vip;

import java.util.List;

public interface VipDao {

    List<Vip> findAllVip();

    Vip findVipByVid(@Param("vid") int vid);

    Long saveVip(Vip vip);

    Long updateVip(Vip vip);

    Long deleteVip(@Param("vid") int vid);

}
