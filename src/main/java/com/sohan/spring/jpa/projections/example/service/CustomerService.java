package com.sohan.spring.jpa.projections.example.service;

import com.sohan.spring.jpa.projections.example.dto.CustomerDetailsDTO;

import java.util.List;

/**
 * Service interface that masks the caller from the implementation that fetches / acts on CustomerDetailsDTO
 * related data.
 *
 * @author Sohan
 */
public interface CustomerService {

    /**
     * Gets all the customers and their orders.
     *
     * @return List<CustomerDetailsDTO>
     */
    List<CustomerDetailsDTO> getCustomersAndOrderData() throws Exception;

    /**
     * Search for customer based on first name.
     *
     * @param firstName
     * @return List<CustomerDetailsDTO>
     */
    List<CustomerDetailsDTO> searchCustomerByFirstName(String firstName) throws  Exception;
}
