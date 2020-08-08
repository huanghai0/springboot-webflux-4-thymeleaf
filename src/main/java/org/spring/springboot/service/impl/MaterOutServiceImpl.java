package org.spring.springboot.service.impl;

import org.spring.springboot.dao.MaterOutDao;
import org.spring.springboot.domain.Mater;
import org.spring.springboot.service.MaterOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterOutServiceImpl implements MaterOutService {

    @Autowired
    private MaterOutDao materOutDao;

    @Override
    public List<Mater> findAllMater() {
        return materOutDao.findAllMater();
    }

    @Override
    public Mater findMaterByMid(int mid) {
        return materOutDao.findMaterByMid(mid);
    }

    @Override
    public Mater findMaterByMname(String mname) {
        return materOutDao.findMaterByMname(mname);
    }

    @Override
    public Long saveMater(Mater mater) {
        return materOutDao.saveMater(mater);
    }

    @Override
    public Long updateMater(Mater mater) {
        return materOutDao.updateMater(mater);
    }

    @Override
    public Long updateMaterNum(int mid, int num) {
        return materOutDao.updateMaterNum(mid, num);
    }

    @Override
    public Long updateMaterSub(int mid) {
        return materOutDao.updateMaterSub(mid);
    }

    @Override
    public Long deleteMater(int mid) {
        return materOutDao.deleteMater(mid);
    }
}
