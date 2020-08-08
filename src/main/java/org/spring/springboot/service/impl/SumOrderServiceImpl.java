package org.spring.springboot.service.impl;


import org.spring.springboot.dao.SumOrderDao;
import org.spring.springboot.domain.Sumorder;
import org.spring.springboot.service.SumOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SumOrderServiceImpl implements SumOrderService {

    @Autowired
    private SumOrderDao sumOrderDao;

    @Override
    public List<Sumorder> sevenDay() {
        return sumOrderDao.sevenDay();
    }
}
