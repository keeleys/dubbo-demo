package com.ttianjun.service.imp;

import com.ttianjun.bean.Order;
import com.ttianjun.service.OrderService;

import java.util.List;

/**
 * @user keeley
 * @date 16/1/14
 */
public class OrderServiceLzn implements OrderService
{
    public List<Order> getAll() {
        System.out.println("OrderServiceLzn getAll");
        return null;
    }
}
