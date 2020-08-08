package org.spring.springboot.controller;


import org.spring.springboot.domain.Car;
import org.spring.springboot.domain.Sale;
import org.spring.springboot.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SaleRestController {

    @Autowired
    SaleService saleService;


    @RequestMapping(value = "/api/sale", method = RequestMethod.GET)
    public List<Sale> findAllSale() {
        return saleService.findAllSale();
    }

    @RequestMapping(value = "/api/sale", method = RequestMethod.POST)
    public void createSale(@RequestBody Sale sale) {
        saleService.saveSale(sale);
    }


}
