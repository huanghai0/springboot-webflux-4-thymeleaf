package org.spring.springboot.controller;

import org.spring.springboot.domain.Vip;
import org.spring.springboot.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VipRestController {

    @Autowired
    private VipService vipService;

    @RequestMapping(value = "/api/vip/{vid}", method = RequestMethod.GET)
    public Vip findOneVip(@PathVariable("vid") int vid) {
        return vipService.findVipByVid(vid);
    }

}
