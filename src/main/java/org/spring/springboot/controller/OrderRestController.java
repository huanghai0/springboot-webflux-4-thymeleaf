package org.spring.springboot.controller;


import org.spring.springboot.domain.Car;
import org.spring.springboot.domain.Order;
import org.spring.springboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderRestController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/api/order/{oid}", method = RequestMethod.GET)
    public Order findOneOrder(@PathVariable("oid") int oid) {
        return orderService.findOrderByOid(oid);
    }

    @RequestMapping(value = "/api/order/ophone/{ophone}", method = RequestMethod.GET)
    public List<Order> findAllOrderByOphone(@PathVariable("ophone") String ophone) {
        return orderService.findAllOrderByOphone(ophone);
    }

    @RequestMapping(value = "/api/order", method = RequestMethod.PUT)
    public void modifyOrder(@RequestBody Order order) {
        orderService.updateOrder(order);
    }

    @RequestMapping(value = "/api/order", method = RequestMethod.GET)
    public List<Order> findAllOrder() {
        return orderService.findAllOrder();
    }

    @RequestMapping(value = "/api/order", method = RequestMethod.POST)
    public void createOrder(@RequestBody Order order) {
        orderService.saveOrder(order);
    }

    @RequestMapping(value = "/api/order/{oid}", method = RequestMethod.DELETE)
    public void modifyOrder(@PathVariable("oid") int oid) {
        orderService.deleteOrder(oid);
    }
}
