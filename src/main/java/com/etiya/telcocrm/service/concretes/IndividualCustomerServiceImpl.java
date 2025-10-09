package com.etiya.telcocrm.service.concretes;

import com.etiya.telcocrm.model.entities.IndividualCustomer;
import com.etiya.telcocrm.repository.IndividualCustomerRepository;
import com.etiya.telcocrm.service.abstracts.IndividualCustomerService;
import com.etiya.telcocrm.service.mappings.IndividualCustomerMapper;
import com.etiya.telcocrm.service.requests.individualcustomers.CreateIndividualCustomerRequest;
import com.etiya.telcocrm.service.responses.individualcustomers.CreatedIndividualCustomerResponse;
import org.springframework.stereotype.Service;

@Service
public class IndividualCustomerServiceImpl implements IndividualCustomerService {

    private final IndividualCustomerRepository individualCustomerRepository;

    public IndividualCustomerServiceImpl(IndividualCustomerRepository individualCustomerRepository){
          this.individualCustomerRepository = individualCustomerRepository;
    }

    @Override
    public CreatedIndividualCustomerResponse add(CreateIndividualCustomerRequest request) {

        IndividualCustomer individualCustomer = IndividualCustomerMapper.INSTANCE.individualCustomerFromCreateIndividualCustomerRequest(request);
        IndividualCustomer createdIndividualCustomer = individualCustomerRepository.save(individualCustomer);
        CreatedIndividualCustomerResponse response =
                IndividualCustomerMapper.INSTANCE.createdIndividualCustomerResponseFromIndividualCustomer(createdIndividualCustomer);
        return response;

    }
}
