package com.hexin.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hexin.OrderServiceConsumer;
import com.hexin.api.order.OrderService;
import com.hexin.domain.orderInfo.OrderInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shengwen.zhang
 * @createDate 2017-11-22 17:56:05.
 * @description
 */
@Service
public class OrderServiceConsumerImpl implements OrderServiceConsumer {
    @Reference(interfaceClass=OrderService.class)
    private OrderService orderService;

    public List<OrderInfo> queryAllOrder(){
        return orderService.listAllOrders();
    }

}
