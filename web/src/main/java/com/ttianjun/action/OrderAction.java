package com.ttianjun.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ttianjun.bean.Order;
import com.ttianjun.service.OrderService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by keeley on 16/1/14.
 */

@Component
public class OrderAction {

    @Reference
    private OrderService orderService;

    public void list(){

        List<Order> orderList = orderService.getAll();

        System.out.println("orderList.size()="+orderList.size());
    }

}
