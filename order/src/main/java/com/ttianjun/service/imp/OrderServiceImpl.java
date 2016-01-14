/**
 * @user keeley
 * @date 16/1/14
 */
package com.ttianjun.service.imp;

import com.ttianjun.bean.Order;
import com.ttianjun.service.OrderService;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    public List<Order> getAll(){
        System.out.println("OrderServiceImpl.getAll");
        List<Order> orders = new ArrayList<Order>();
        for(int i=0;i<5;i++){
            Order tmpOrder = new Order();
            tmpOrder.setId(i);
            tmpOrder.setName("name"+i);
            tmpOrder.setName("no"+i);

            orders.add(tmpOrder);
        }
        return orders;
    }
}
