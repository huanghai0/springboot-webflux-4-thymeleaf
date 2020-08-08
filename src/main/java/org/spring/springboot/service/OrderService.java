package org.spring.springboot.service;

import org.spring.springboot.domain.Order;

import java.util.List;

public interface OrderService {

    List<Order> findAllOrder();

    List<Order> findAllOrderByOphone(String ophone);

    /**
     * 根据城市 ID,查询城市信息
     *
     * @param oid
     * @return
     */
    Order findOrderByOid(int oid);


    /**
     * 新增城市信息
     *
     * @param order
     * @return
     */
    Long saveOrder(Order order);

    /**
     * 更新城市信息
     *
     * @param order
     * @return
     */
     Long updateOrder(Order order);

    /**
     * 根据城市 ID,删除城市信息
     *
     * @param oid
     * @return
     */
    Long deleteOrder(int oid);
}
