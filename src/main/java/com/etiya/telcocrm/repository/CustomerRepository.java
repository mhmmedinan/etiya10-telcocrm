package com.etiya.telcocrm.repository;

import com.etiya.telcocrm.model.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    boolean existsById(int id);
}
