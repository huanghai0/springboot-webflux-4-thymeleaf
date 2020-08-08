package org.spring.springboot.service.impl;

import org.spring.springboot.dao.MaterInDao;
import org.spring.springboot.domain.Mater;
import org.spring.springboot.service.MaterInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterInServiceImpl implements MaterInService {

    @Autowired
    private MaterInDao materInDao;

    @Override
    public List<Mater> findAllMater() {
        return materInDao.findAllMater();
    }

    @Override
    public Mater findMaterByMid(int mid) {
        return materInDao.findMaterByMid(mid);
    }

    @Override
    public Long saveMater(Mater mater) {
        return materInDao.saveMater(mater);
    }

    @Override
    public Long updateMater(Mater mater) {
        return materInDao.updateMater(mater);
    }

    @Override
    public Long updateMaterNum(int num) {
        return materInDao.updateMaterNum(num);
    }

    @Override
    public Long deleteMater(int mid) {
        return materInDao.deleteMater(mid);
    }

}
