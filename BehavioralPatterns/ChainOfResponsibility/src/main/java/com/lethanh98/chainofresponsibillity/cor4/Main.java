package com.lethanh98.chainofresponsibillity.cor4;

import com.lethanh98.chainofresponsibillity.cor4.entity.OrderEntity;
import com.lethanh98.chainofresponsibillity.cor4.service.impl.OrderService;

public class Main {
    public static void main(String[] args) {
        OrderEntity orderEntity = OrderEntity.builder().nameOrder("order1").token("token").numberOrder(5).build();
        OrderService orderService = new OrderService();
        orderService.order(orderEntity);
    }
}
