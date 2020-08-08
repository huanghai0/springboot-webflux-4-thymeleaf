package org.spring.springboot.service;

import org.spring.springboot.domain.Car;



import java.util.List;

public interface CarService {
    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<Car> findAllCar();

    List<Car> findAllCarByCphone(String cphone);

    /**
     * 根据城市 ID,查询城市信息
     *
     * @param cid
     * @return
     */
    Car findCarByCid(int cid);

    /**
     * 新增城市信息
     *
     * @param car
     * @return
     */
    Long saveCar(Car car);

    /**
     * 更新城市信息
     *
     * @param car
     * @return
     */
    Long updateCar(Car car);

    /**
     * 根据城市 ID,删除城市信息
     *
     * @param cid
     * @return
     */
    Long deleteCar(int cid);
}
