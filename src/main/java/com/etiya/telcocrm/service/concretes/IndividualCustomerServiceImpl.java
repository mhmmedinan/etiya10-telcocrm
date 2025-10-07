package com.etiya.telcocrm.service.concretes;

import com.etiya.telcocrm.model.entities.IndividualCustomer;
import com.etiya.telcocrm.repository.IndividualCustomerRepository;
import com.etiya.telcocrm.service.abstracts.IndividualCustomerService;
import org.springframework.stereotype.Service;

@Service
public class IndividualCustomerServiceImpl implements IndividualCustomerService {

    private final IndividualCustomerRepository individualCustomerRepository;

    public IndividualCustomerServiceImpl(IndividualCustomerRepository individualCustomerRepository){
          this.individualCustomerRepository = individualCustomerRepository;
    }

    @Override
    public void add(IndividualCustomer individualCustomer) {
        individualCustomerRepository.save(individualCustomer);
    }
}
