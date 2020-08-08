package org.spring.springboot.dao;

import org.spring.springboot.domain.Sale;

import java.util.List;

public interface SaleDao {

    List<Sale> findAllSale();

    Long saveSale(Sale sale);
}
