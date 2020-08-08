package org.spring.springboot.service.impl;

import org.spring.springboot.dao.SumPriceDao;
import org.spring.springboot.domain.Sumprice;
import org.spring.springboot.service.SumPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SumPriceImpl implements SumPriceService {

    @Autowired
    private SumPriceDao sumPriceDao;

    @Override
    public List<Sumprice> SumPrice() {
        return sumPriceDao.SumPrice();
    }
}
