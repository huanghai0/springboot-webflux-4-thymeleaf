package org.spring.springboot.controller;


import org.spring.springboot.domain.Sumorder;
import org.spring.springboot.service.SumOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SumOrderRestController {

    @Autowired
    private SumOrderService sumOrderService;

    @RequestMapping(value = "api/sum",method = RequestMethod.POST)
    public List<Sumorder> sumOrder(){
        System.out.println("__________________>>>");
        return sumOrderService.sevenDay();
    }
}
