package com.hexin;

import com.hexin.domain.orderInfo.OrderInfo;

import java.util.List;

/**
 * @author shengwen.zhang
 * @createDate 2017-11-22 18:05:16.
 * @description
 */
public interface OrderServiceConsumer {

    List<OrderInfo> queryAllOrder();
}
