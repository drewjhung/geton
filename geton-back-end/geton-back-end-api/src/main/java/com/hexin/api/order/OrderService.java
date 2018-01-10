package com.hexin.api.order;

import com.hexin.domain.orderInfo.OrderInfo;

import java.util.List;

/**
 * @author shengwen.zhang
 * @createDate 2017-11-22 13:54:14.
 * @description
 */
public interface OrderService {
    List<OrderInfo> listAllOrders();
}
