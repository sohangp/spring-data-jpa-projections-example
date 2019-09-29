package com.sohan.spring.jpa.projections.example.dao;

import com.sohan.spring.jpa.projections.example.dao.entities.CustomerEntity;
import com.sohan.spring.jpa.projections.example.dto.CustomerDetailsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This interface provides handles to database, to perform CRUD operations on the CustomerDetailsDTO table `CUSTOMER`.
 * The table is represented by the JPA entity {@link CustomerEntity}.
 * <p>
 * The interface also executes native queries and uses projection to build the result DTO.
 *
 * @author Sohan
 * @see JpaRepository
 * @see Query
 */
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

    /**
     * This will list all customers with their orders, whether they placed any order or not.
     *
     * @return List<CustomerDetailsDTO>
     */
    @Query(name = "customerEntity.getCustomerDetails", nativeQuery = true)
    List<CustomerDetailsDTO> getCustomerDetails();

    /**
     * This will list all customers based on first name.
     *
     * @return List<CustomerDetailsDTO>
     */
    @Query(name = "customerEntity.searchCustomerByFirstName", nativeQuery = true)
    List<CustomerDetailsDTO> searchCustomerByFirstName(@Param("firstName") String firstName);
}
