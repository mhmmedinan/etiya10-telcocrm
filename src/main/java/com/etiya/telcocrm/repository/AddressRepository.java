package com.etiya.telcocrm.repository;

import com.etiya.telcocrm.model.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
