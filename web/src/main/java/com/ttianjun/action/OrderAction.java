package com.ttianjun.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ttianjun.bean.Order;
import com.ttianjun.service.OrderService;
import com.ttianjun.service.StockService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @user keeley
 * @date 16/1/14
 */

@Controller
public class OrderAction {

    @Reference(group = "sz")
    private OrderService orderService;

    @Reference
    private StockService stockService;

    @RequestMapping("/list")
    public String list(){

        List<Order> orderList = orderService.getAll();

        System.out.println("orderList.size()="+orderList.size());

        stockService.test();
        return "list";
    }
    @RequestMapping("/")
    public String index(){
        System.out.println("index");
        return "index";
    }

}
