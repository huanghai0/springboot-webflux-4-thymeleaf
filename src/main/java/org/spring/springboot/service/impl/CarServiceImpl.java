package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CarDao;
import org.spring.springboot.domain.Car;
import org.spring.springboot.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {


    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> findAllCar() {
        return carDao.findAllCar();
    }

    @Override
    public List<Car> findAllCarByCphone(String cphone) {
        return carDao.findAllCarByCphone(cphone);
    }

    @Override
    public Car findCarByCid(int cid) {
        return carDao.findByCid(cid);
    }

    @Override
    public Long saveCar(Car car) {
        return carDao.saveCar(car);
    }

    @Override
    public Long updateCar(Car car) {
        return carDao.updateCar(car);
    }

    @Override
    public Long deleteCar(int cid) {
        return carDao.deleteCar(cid);
    }
}
