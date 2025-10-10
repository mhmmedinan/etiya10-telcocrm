package com.etiya.telcocrm.service.rules;

import com.etiya.telcocrm.core.crosscuttingconcerns.exceptions.types.BusinessException;
import com.etiya.telcocrm.model.entities.Customer;
import com.etiya.telcocrm.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class CustomerBusinessRules<T extends Customer> {

    private final CustomerRepository<T> customerRepository;

    public CustomerBusinessRules(CustomerRepository<T> customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void checkIfCustomerIdExists(int id){
        if(!customerRepository.existsById(id))
            throw new BusinessException("Customer not found");
    }
}
