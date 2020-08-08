package org.spring.springboot.service;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Vip;

import java.util.List;

public interface VipService {

    List<Vip> findAllVip();

    Vip findVipByVid(int vid);

    Long saveVip(Vip vip);

    Long updateVip(Vip vip);

    Long deleteVip(int vid);

}
