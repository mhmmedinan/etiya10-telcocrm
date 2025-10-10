package com.etiya.telcocrm.service.rules;

import com.etiya.telcocrm.repository.IndividualCustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class IndividualCustomerBusinessRules {

    private final IndividualCustomerRepository individualCustomerRepository;

    public IndividualCustomerBusinessRules(IndividualCustomerRepository individualCustomerRepository) {
        this.individualCustomerRepository = individualCustomerRepository;
    }

    public void checkIfIndividualCustomerExistsByIdentityNumber(String nationalId){
        if(individualCustomerRepository.existsByNationalId(nationalId))
            throw new RuntimeException("Individual customer exists");
    }
}
