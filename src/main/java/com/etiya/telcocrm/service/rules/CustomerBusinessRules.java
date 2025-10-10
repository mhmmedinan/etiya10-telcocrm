package com.etiya.telcocrm.service.rules;

import com.etiya.telcocrm.core.crosscuttingconcerns.exceptions.types.BusinessException;
import com.etiya.telcocrm.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerBusinessRules {

    private final CustomerRepository customerRepository;

    public CustomerBusinessRules(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void checkIfCustomerIdExists(int id){
        if(customerRepository.existsById(id))
            throw new BusinessException("test mesajıdır");
    }
}
