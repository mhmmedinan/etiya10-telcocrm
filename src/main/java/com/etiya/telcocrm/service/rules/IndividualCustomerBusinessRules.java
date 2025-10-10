package com.etiya.telcocrm.service.rules;

import com.etiya.telcocrm.core.crosscuttingconcerns.exceptions.types.BusinessException;
import com.etiya.telcocrm.model.entities.IndividualCustomer;
import com.etiya.telcocrm.repository.IndividualCustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class IndividualCustomerBusinessRules extends CustomerBusinessRules<IndividualCustomer> {

    private final IndividualCustomerRepository individualCustomerRepository;

    public IndividualCustomerBusinessRules(IndividualCustomerRepository individualCustomerRepository) {
        super(individualCustomerRepository);
        this.individualCustomerRepository = individualCustomerRepository;
    }

    public void checkIfIndividualCustomerExistsByIdentityNumber(String nationalId){
        if(individualCustomerRepository.existsByNationalId(nationalId))
            throw new BusinessException("Individual customer exists");
    }



}
