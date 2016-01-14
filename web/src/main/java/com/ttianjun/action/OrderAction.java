package com.ttianjun.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ttianjun.bean.Order;
import com.ttianjun.service.OrderService;
import com.ttianjun.service.StockService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @user keeley
 * @date 16/1/14
 */

@Component
public class OrderAction {

    @Reference(group = "sz")
    private OrderService orderService;

    @Reference
    private StockService stockService;

    public void list(){

        List<Order> orderList = orderService.getAll();

        System.out.println("orderList.size()="+orderList.size());

        stockService.test();
    }

}
