package org.spring.springboot.controller;


import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Mater;
import org.spring.springboot.service.MaterOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MaterOutRestController {

    @Autowired
    private MaterOutService materOutService;

    @RequestMapping(value = "/api/materout", method = RequestMethod.GET)
    public List<Mater> findAllMater() {
        return materOutService.findAllMater();
    }

    @RequestMapping(value = "/api/materout/{mname}", method = RequestMethod.GET)
    public Mater findAllMaterByMname(@PathVariable("mname") String mname) {
        return materOutService.findMaterByMname(mname);
    }

    @RequestMapping(value = "/api/materout/id/{mid}", method = RequestMethod.GET)
    public Mater findAllMaterByMid(@PathVariable("mid") int mid) {
        return materOutService.findMaterByMid(mid);
    }

    @RequestMapping(value = "/api/materout", method = RequestMethod.POST)
    public void saveMater(@RequestBody Mater mater) {
        materOutService.saveMater(mater);
    }


    @RequestMapping(value = "/api/materout", method = RequestMethod.PUT)
    public void updateMater(@RequestBody Mater mater) {
        materOutService.updateMater(mater);
    }

    @RequestMapping(value = "/api/materout/{mid}/{mnum}", method = RequestMethod.PUT)
    public void updateMaterNum(@PathVariable("mid") int mid, @PathVariable("mnum") int mnum) {
        materOutService.updateMaterNum(mid, mnum);
    }

    @RequestMapping(value = "api/materout/{mid}", method = RequestMethod.PUT)
    public void updateMaterSub(@PathVariable("mid") int mid) {
        materOutService.updateMaterSub(mid);
    }

}
