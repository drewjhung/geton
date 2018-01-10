package com.hexin.service.order;

import com.google.common.collect.Lists;
import com.hexin.api.order.OrderService;
import com.hexin.domain.orderInfo.OrderInfo;
import com.hexin.repository.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author shengwen.zhang
 * @createDate 2017-11-22 15:33:48.
 * @description
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class OrderInfoServiceImpl implements OrderService {
    @Autowired private OrderMapper orderMapper;
    @Override
    public List<OrderInfo> listAllOrders() {
        List<OrderInfo> orderList = Lists.newArrayList();
        orderList.add(orderMapper.findByOrderNumber("KSC201711291742271767QH"));
        return orderList;
    }
}
