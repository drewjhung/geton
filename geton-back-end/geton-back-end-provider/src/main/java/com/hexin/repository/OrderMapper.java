package com.hexin.repository;

import com.hexin.domain.orderInfo.OrderInfo;

import java.util.List;
import java.util.Map;

/**
 * @author shengwen.zhang
 * @createDate 2017-12-05 18:29:34.
 * @description
 */
public interface OrderMapper {
    List<OrderInfo> findAll();
    OrderInfo findByOrderNumber(String orderNumber);
    OrderInfo findByMap(Map<String, Object> params);
    int insert(OrderInfo orderInfo);
}
