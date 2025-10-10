package com.etiya.telcocrm.repository;

import com.etiya.telcocrm.model.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CustomerRepository<T extends Customer> extends JpaRepository<T,Integer>
{
    boolean existsById(int id);
}
