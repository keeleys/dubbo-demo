package com.ttianjun.action;

import com.ttianjun.bean.Order;
import com.ttianjun.service.OrderService;

import java.util.List;

/**
 * Created by keeley on 16/1/14.
 */
public class OrderAction {

    private OrderService orderService;

    public void list(){

        List<Order> orderList = orderService.getAll();

        System.out.println("orderList.size()="+orderList.size());
    }

}
