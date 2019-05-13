package com.sohan.spring.jpa.projections.example.dto;

import org.springframework.stereotype.Component;

@Component
public class MapperUtility {

    public CustomerOrderDTO buildOrderDTO(Long orderNumber, Double totalAmount) {
        CustomerOrderDTO customerOrderDTO = null;

        if (orderNumber != null) {
            customerOrderDTO = new CustomerOrderDTO();
            customerOrderDTO.setOrderNumber(orderNumber);
            customerOrderDTO.setTotalAmount("$" + totalAmount);
        }
        return customerOrderDTO;
    }
}
