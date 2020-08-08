package org.spring.springboot.service;

import org.spring.springboot.domain.Sale;

import java.util.List;

public interface SaleService {

    List<Sale> findAllSale();

    Long saveSale(Sale sale);


}
