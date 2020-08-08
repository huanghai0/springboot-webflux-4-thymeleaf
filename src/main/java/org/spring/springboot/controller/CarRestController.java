package org.spring.springboot.controller;


import org.spring.springboot.domain.Car;
import org.spring.springboot.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarRestController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/api/car/{cid}", method = RequestMethod.GET)
    public Car findOneCar(@PathVariable("cid") int cid) {
        return carService.findCarByCid(cid);
    }

    @RequestMapping(value = "/api/car/cphone/{cphone}", method = RequestMethod.GET)
    public List<Car> findAllCarByCphone(@PathVariable("cphone") String cphone){
        return carService.findAllCarByCphone(cphone);
    }

    @RequestMapping(value = "/api/car", method = RequestMethod.GET)
    public List<Car> findAllCar() {
        return carService.findAllCar();
    }

    @RequestMapping(value = "/api/car", method = RequestMethod.POST)
    public void createCity(@RequestBody Car car) {
        carService.saveCar(car);
    }

    @RequestMapping(value = "/api/car", method = RequestMethod.PUT)
    public void modifyCar(@RequestBody Car car) {
        carService.updateCar(car);
    }

    @RequestMapping(value = "/api/car/{cid}", method = RequestMethod.DELETE)
    public void modifyCar(@PathVariable("cid") int cid) {
        carService.deleteCar(cid);
    }
}
