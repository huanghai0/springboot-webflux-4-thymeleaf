package org.spring.springboot.controller.web;


import org.spring.springboot.domain.User;
import org.spring.springboot.domain.Vip;
import org.spring.springboot.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/vip")
public class VipController {


    private static final String VIP_FORM_PATH_NAME = "vipForm";
    private static final String VIP_LIST_PATH_NAME = "vipList";
    private static final String VIP_FORM_UPDATE = "vipFormUpdate";
    private static final String REDIRECT_TO_VIP_URL = "redirect:/vip";

    @Autowired
    private VipService vipService;

    @RequestMapping(method = RequestMethod.GET)
    public String getVipList(ModelMap map){
       map.addAttribute("vipList",vipService.findAllVip());
       return VIP_LIST_PATH_NAME;
    }


    @RequestMapping(value = "/update/{vid}", method = RequestMethod.GET)
    public String getVip(@PathVariable int vid, ModelMap map) {
        map.addAttribute("vip", vipService.findVipByVid(vid));
        System.out.println(map.get("vip").toString() + "--------------------->>>>>");
        map.addAttribute("action", "update");
        return VIP_FORM_UPDATE;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String putVip(@ModelAttribute Vip vip) {
        vipService.updateVip(vip);
        return REDIRECT_TO_VIP_URL;
    }

    @RequestMapping(value = "/delete/{vid}", method = RequestMethod.GET)
    public String deleteVip(@PathVariable("vid") int vid) {
        vipService.deleteVip(vid);
        return REDIRECT_TO_VIP_URL;
    }



}
