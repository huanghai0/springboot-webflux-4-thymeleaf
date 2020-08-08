package org.spring.springboot.controller.web;


import org.spring.springboot.domain.Mater;
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
@RequestMapping(value = "/materout")
public class MaterOutController {

    private static final String MATEROUT_FORM_PATH_NAME = "materoutForm";
    private static final String MATEROUT_LIST_PATH_NAME = "materoutList";
    private static final String MATEROUT_FORM_UPDATE = "materoutFormUpdate";
    private static final String REDIRECT_TO_MATEROUT_URL = "redirect:/materout";

    @Autowired
    private MaterOutService materOutService;

    @RequestMapping(method = RequestMethod.GET)
    public String getMaterOutList(ModelMap map) {
        map.addAttribute("materoutList", materOutService.findAllMater());
        return MATEROUT_LIST_PATH_NAME;
    }


    @RequestMapping(value = "/update/{mid}", method = RequestMethod.GET)
    public String getMater(@PathVariable int mid, ModelMap map) {
        map.addAttribute("mater", materOutService.findMaterByMid(mid));
        System.out.println(map.get("mater").toString() + "--------------------->>>>>");
        map.addAttribute("action", "update");
        return MATEROUT_FORM_UPDATE;
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String putMater(@ModelAttribute Mater mater) {
        System.out.println(mater + "--------------------->>>>>");
        materOutService.updateMater(mater);
        return REDIRECT_TO_MATEROUT_URL;
    }

    @Transactional
    @RequestMapping(value = "/delete/{mid}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("mid") int mid) {
        materOutService.deleteMater(mid);
        return REDIRECT_TO_MATEROUT_URL;
    }

}
