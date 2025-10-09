package com.etiya.telcocrm.repository;

import com.etiya.telcocrm.model.entities.IndividualCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IndividualCustomerRepository extends JpaRepository<IndividualCustomer,Integer> {

    //JPQL
    /*@Query("SELECT ic FROM IndividualCustomer ic " +
            "LEFT JOIN FETCH ic.addresses a " +
            "LEFT JOIN FETCH a.district d " +
            "LEFT JOIN FETCH d.city")
    List<IndividualCustomer> findAllWithAddresses();*/


    List<IndividualCustomer> findByLastName(String lastName);

}

