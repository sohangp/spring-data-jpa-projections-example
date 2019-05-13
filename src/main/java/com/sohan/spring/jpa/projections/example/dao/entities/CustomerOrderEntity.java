package com.sohan.spring.jpa.projections.example.dao.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity that maps the CUSTOMER_ORDER table.
 */
@Data
@Entity
@Table(name = "CUSTOMER_ORDER")
public class CustomerOrderEntity {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ORDER_NUMBER")
    private String orderNumber;

    @Column(name = "TOTAL_AMOUNT")
    private String totalAmount;

    @Column(name = "CUSTOMER_ID")
    private String customerId;
}
