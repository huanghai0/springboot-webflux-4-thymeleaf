package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Car;


import java.util.List;

public interface CarDao {


    List<Car> findAllCar();

    List<Car> findAllCarByCphone(@Param("cphone") String cphone);

    Car findByCid(@Param("cid") int cid);

    Long saveCar(Car car);

    Long updateCar(Car car);

    Long deleteCar(int cid);
}
