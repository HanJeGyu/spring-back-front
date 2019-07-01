package com.bit.web.repositories;

import java.util.Optional;

import com.bit.web.domain.CustomerDTO;
import com.bit.web.entities.Customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * CustomerRepository
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
    public Optional<Customer> findByCustomerId (String customerId);
    public void deleteById (String customerId);
}