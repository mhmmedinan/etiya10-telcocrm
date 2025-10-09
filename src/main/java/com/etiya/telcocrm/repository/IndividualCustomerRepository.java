package com.etiya.telcocrm.repository;

import com.etiya.telcocrm.model.entities.IndividualCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndividualCustomerRepository extends JpaRepository<IndividualCustomer,Integer> {

    //JPQL
    @Query("Select ic From IndividualCustomer ic Left Join Fetch ic.addresses a Left Join Fetch a.district")
    List<IndividualCustomer> findAllWithAddresses();

    IndividualCustomer findByFirstName(String firstName);
}

