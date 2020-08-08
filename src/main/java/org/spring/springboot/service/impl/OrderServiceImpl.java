package org.spring.springboot.service.impl;

import org.spring.springboot.dao.OrderDao;
import org.spring.springboot.domain.Order;
import org.spring.springboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;


    public List<Order> findAllOrder() {
        return orderDao.findAllOrder();
    }


    public List<Order> findAllOrderByOphone(String ophone) {
        return orderDao.findAllOrderByOphone(ophone);
    }

    @Override
    public Order findOrderByOid(int oid) {
        return orderDao.findOrderByOid(oid);
    }

    @Override
    public Long updateOrder(Order order) {
        return orderDao.updateOrder(order);
    }

    @Override
    public Long saveOrder(Order order) {
        return orderDao.saveOrder(order);
    }

    @Override
    public Long deleteOrder(int oid) {
        return orderDao.deleteOrder(oid);
    }
}
