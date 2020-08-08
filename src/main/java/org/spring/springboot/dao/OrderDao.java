package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;

import org.spring.springboot.domain.Order;

import java.util.List;

public interface OrderDao {


    List<Order> findAllOrder();

    List<Order> findAllOrderByOphone(@Param("ophone") String ophone);

    Order findOrderByOid(@Param("oid") int oid);

    Long saveOrder(Order order);

    Long updateOrder(Order order);

    Long deleteOrder(int oid);
}
