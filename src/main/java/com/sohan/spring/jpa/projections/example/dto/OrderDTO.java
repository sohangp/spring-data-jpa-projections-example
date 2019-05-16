package com.sohan.spring.jpa.projections.example.dto;

/**
 * POJO for holding Order related data
 */
public class OrderDTO {
    private Long orderNumber;
    private String totalAmount;

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
}
