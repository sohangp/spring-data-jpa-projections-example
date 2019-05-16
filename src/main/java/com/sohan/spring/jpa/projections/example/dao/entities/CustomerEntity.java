package com.sohan.spring.jpa.projections.example.dao.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Entity that maps the CUSTOMER table.
 */
@Data
@Entity
@Table(name = "CUSTOMER")
public class CustomerEntity {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "CITY")
    private String city;

    @Column(name = "COUNTRY")
    private String country;

    @OneToOne(mappedBy="customer")
    private OrderEntity order;
}
