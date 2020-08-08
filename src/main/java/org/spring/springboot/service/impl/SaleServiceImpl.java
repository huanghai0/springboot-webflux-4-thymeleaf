package org.spring.springboot.service.impl;

import org.spring.springboot.dao.SaleDao;
import org.spring.springboot.domain.Sale;
import org.spring.springboot.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    private SaleDao saleDao;

    @Override
    public List<Sale> findAllSale() {
        return saleDao.findAllSale();
    }

    @Override
    public Long saveSale(Sale sale) {
        return saleDao.saveSale(sale);
    }
}
