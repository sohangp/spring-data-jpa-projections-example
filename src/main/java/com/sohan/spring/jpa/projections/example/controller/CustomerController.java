package com.sohan.spring.jpa.projections.example.controller;

import com.sohan.spring.jpa.projections.example.dto.CustomerDetailsDTO;
import com.sohan.spring.jpa.projections.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This spring controller handles all the API calls made on the end point.
 * <p>
 * - /customers: Gets the customers and their orders.<p/>
 * - /customers/{customerId}: Gets the customers and their orders.<p/>
 *
 * @author Sohan
 */
@RestController
public class CustomerController {

    /**
     * Handle to the service.
     */
    @Autowired
    private CustomerService customerService;

    /**
     * Gets all the customers and their orders.
     *
     * @return List<CustomerDetailsDTO>
     */
    @RequestMapping(value = "/customers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDetailsDTO> getCustomers() throws Exception {
        return customerService.getCustomersAndOrderData();
    }
}
