package org.spring.springboot.controller.web;

import org.spring.springboot.domain.Mater;
import org.spring.springboot.service.MaterInService;
import org.spring.springboot.service.MaterOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/materin")
public class MaterInController {

    private static final String MATERIN_FORM_PATH_NAME = "materinForm";
    private static final String MATERIN_LIST_PATH_NAME = "materinList";
    private static final String MATERIN_FORM_UPDATE = "materinFormUpdate";
    private static final String REDIRECT_TO_MATERIN_URL = "redirect:/materin";

    @Autowired
    private MaterInService materInService;
    @Autowired
    private MaterOutService materOutService;

    @RequestMapping(method = RequestMethod.GET)
    public String getMaterInList(ModelMap map) {
        map.addAttribute("materinList", materInService.findAllMater());
        return MATERIN_LIST_PATH_NAME;
    }


    @RequestMapping(value = "/update/{mid}", method = RequestMethod.GET)
    public String getMater(@PathVariable int mid, ModelMap map) {
        map.addAttribute("mater", materInService.findMaterByMid(mid));
        System.out.println(map.get("mater").toString() + ">>>>>");
        map.addAttribute("action", "update");
        return MATERIN_FORM_UPDATE;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String putMater(@ModelAttribute Mater mater) {
        System.out.println(mater.toString() + "------------------>>>>>");
        materInService.updateMater(mater);
        return REDIRECT_TO_MATERIN_URL;
    }


    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createMaterinForm(ModelMap map) {
        map.addAttribute("mater", new Mater());
        map.addAttribute("action", "create");
        return MATERIN_FORM_PATH_NAME;
    }

    @Transactional
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String postMaterin(@ModelAttribute Mater mater) {
        materInService.saveMater(mater);
        Mater materout = materOutService.findMaterByMname(mater.getMname());
        if (materout != null) {
            materOutService.updateMaterNum(materout.getMid(), materout.getMnum() + mater.getMnum());
        } else {
            materOutService.saveMater(mater);
        }
        return REDIRECT_TO_MATERIN_URL;
    }

    @Transactional
    @RequestMapping(value = "/delete/{mid}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("mid") int mid) {
        Mater mater = materInService.findMaterByMid(mid);
        materInService.deleteMater(mid);
        Mater materout = materOutService.findMaterByMname(mater.getMname());
        if (materout != null) {
            if (materout.getMnum() - mater.getMnum() >= 0) {
                materOutService.updateMaterNum(materout.getMid(), materout.getMnum() - mater.getMnum());
            }
        }
        return REDIRECT_TO_MATERIN_URL;
    }

}
