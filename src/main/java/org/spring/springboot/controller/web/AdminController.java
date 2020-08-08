package org.spring.springboot.controller.web;


import org.spring.springboot.dao.AccountDao;
import org.spring.springboot.domain.Account;
import org.spring.springboot.domain.Sumorder;
import org.spring.springboot.domain.Sumprice;
import org.spring.springboot.service.SumOrderService;
import org.spring.springboot.service.SumPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping(value = "/index")
public class AdminController {
    private static final String INDEX_LIST_PATH_NAME = "/index";

    @Autowired
    private SumOrderService sumOrderService;
    @Autowired
    private SumPriceService sumPriceService;

    @Autowired
    private AccountDao accountDao;


    @RequestMapping(value = "login")
    public String getAccount(ModelMap map) {
        map.addAttribute("account", new Account());
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "login/yz", method = RequestMethod.POST)
    public void adminLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute Account account) {
        System.out.println(account.toString() + "+++++++---");
        Account accountLogin = accountDao.login(account.getAid(), account.getApwd());
        try {
            PrintWriter out = response.getWriter();
            if (accountLogin != null) {
                out.print("1");
            } else {
                out.print("2");
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    @ResponseBody
//    @RequestMapping(value = "login/yzz", method = RequestMethod.POST)
//    public void adminLo(ModelMap map, @ModelAttribute Account account) {
//        System.out.println(account.toString() + "+++++++---");
//        Account accountLogin = accountDao.login(account.getAid(), account.getApwd());
//        if (accountLogin != null) {
//            map.addAttribute("myMsg", "1");
//        } else {
//            map.addAttribute("myMsg", "2");
//        }
//    }

    @RequestMapping(method = RequestMethod.GET)
    public String admin() {
        return INDEX_LIST_PATH_NAME;
    }

    @RequestMapping(value = "/sumorder")
    @ResponseBody
    public List<Sumorder> sumOrder() {
        System.out.println("sumOrder-------------->>>");
        return sumOrderService.sevenDay();
    }

    @RequestMapping(value = "/sumprice")
    @ResponseBody
    public List<Sumprice> sumPrice() {
        System.out.println("sumPrice-------------->>>");
        return sumPriceService.SumPrice();
    }

}
