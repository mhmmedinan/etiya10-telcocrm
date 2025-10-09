package com.etiya.telcocrm.repository;

import com.etiya.telcocrm.model.entities.IndividualCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface IndividualCustomerRepository extends JpaRepository<IndividualCustomer,Integer> {

    //JPQL
    /*@Query("SELECT ic FROM IndividualCustomer ic " +
            "LEFT JOIN FETCH ic.addresses a " +
            "LEFT JOIN FETCH a.district d " +
            "LEFT JOIN FETCH d.city")
    List<IndividualCustomer> findAllWithAddresses();*/


    List<IndividualCustomer> findByLastNameIgnoreCase(String lastName);

    //JPQL
    //Belirli bir isimle başlayan müşteriler
    @Query("Select ic From IndividualCustomer ic Where ic.firstName LIKE :prefix%")
    List<IndividualCustomer> findByFirstNameStartingPrefix(@Param("prefix") String prefix);

}

