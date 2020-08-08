package org.spring.springboot.service.impl;

import org.spring.springboot.dao.VipDao;
import org.spring.springboot.domain.Vip;
import org.spring.springboot.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipServiceImpl implements VipService {

    @Autowired
    private VipDao vipDao;

    @Override
    public List<Vip> findAllVip() {
        return vipDao.findAllVip();
    }

    @Override
    public Vip findVipByVid(int vid) {
        return vipDao.findVipByVid(vid);
    }

    @Override
    public Long saveVip(Vip vip) {
        return vipDao.saveVip(vip);
    }

    @Override
    public Long updateVip(Vip vip) {
        return vipDao.updateVip(vip);
    }

    @Override
    public Long deleteVip(int vid) {
        return vipDao.deleteVip(vid);
    }
}
