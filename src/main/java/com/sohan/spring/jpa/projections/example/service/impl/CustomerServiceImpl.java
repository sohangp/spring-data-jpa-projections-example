package com.sohan.spring.jpa.projections.example.service.impl;

import com.sohan.spring.jpa.projections.example.dao.CustomerRepository;
import com.sohan.spring.jpa.projections.example.dto.CustomerDetailsDTO;
import com.sohan.spring.jpa.projections.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service Implementation that fetches / acts on CustomerDetailsDTO related data.
 *
 * @author Sohan
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    /**
     * Handle to the Data Access Layer.
     */
    @Autowired
    private CustomerRepository customerRepository;

    /**
     * Gets all the customers and their orders.
     *
     * @return CustomerDetailsDTO
     */
    @Override
    public List<CustomerDetailsDTO> getCustomersAndOrderData() throws Exception {
        return customerRepository.getCustomerDetails();
    }
}
