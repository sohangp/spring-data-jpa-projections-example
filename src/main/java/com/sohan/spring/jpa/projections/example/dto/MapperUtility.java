package com.sohan.spring.jpa.projections.example.dto;

import org.springframework.stereotype.Component;

@Component
public class MapperUtility {

    public OrderDTO buildOrderDTO(Long orderNumber, Double totalAmount) {
        OrderDTO order = null;

        if (orderNumber != null) {
            order = new OrderDTO();
            order.setOrderNumber(orderNumber);
            order.setTotalAmount("$" + totalAmount);
        }
        return order;
    }
}
