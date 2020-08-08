package org.spring.springboot.controller.web;


import org.spring.springboot.domain.Order;
import org.spring.springboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/order")
public class OrderController {

    private static final String ORDER_FORM_PATH_NAME = "orderForm";
    private static final String ORDER_LIST_PATH_NAME = "orderList";
    private static final String ORDER_FORM_UPDATE = "orderFormUpdate";
    private static final String REDIRECT_TO_ORDER_URL = "redirect:/order";

    @Autowired
    private OrderService orderService;

    @RequestMapping(method = RequestMethod.GET)
    public String getOrderList(ModelMap map) {
        map.addAttribute("orderList", orderService.findAllOrder());
        return ORDER_LIST_PATH_NAME;
    }


    @RequestMapping(value = "/delete/{oid}", method = RequestMethod.GET)
    public String deleteOrder(@PathVariable int oid) {
       orderService.deleteOrder(oid);
        return REDIRECT_TO_ORDER_URL;
    }

    /**
     * 获取更新 Order 表单
     * 处理 "/order/update/{id}" 的 GET 请求，通过 URL 中的 id 值获取 Book 信息
     * URL 中的 id ，通过 @PathVariable 绑定参数
     */
    @RequestMapping(value = "/update/{oid}", method = RequestMethod.GET)
    public String getOrder(@PathVariable int oid, ModelMap map) {
        map.addAttribute("order", orderService.findOrderByOid(oid));
        System.out.println(map.get("order").toString()+"--------------------->>>>>");
        map.addAttribute("action", "update");
        return ORDER_FORM_UPDATE;
    }

    /**
     * 更新 Order
     * 处理 "/update" 的 PUT 请求，用来更新 Book 信息
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String putOrder(@ModelAttribute Order order) {
        orderService.updateOrder(order);
        return REDIRECT_TO_ORDER_URL;
    }
}
