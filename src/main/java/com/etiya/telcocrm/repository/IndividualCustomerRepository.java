package com.etiya.telcocrm.repository;

import com.etiya.telcocrm.model.entities.IndividualCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndividualCustomerRepository extends JpaRepository<IndividualCustomer,Integer> {
}

