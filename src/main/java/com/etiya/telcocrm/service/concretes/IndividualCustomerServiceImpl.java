package com.etiya.telcocrm.service.concretes;

import com.etiya.telcocrm.model.entities.IndividualCustomer;
import com.etiya.telcocrm.repository.IndividualCustomerRepository;
import com.etiya.telcocrm.service.abstracts.IndividualCustomerService;
import com.etiya.telcocrm.service.mappings.IndividualCustomerMapper;
import com.etiya.telcocrm.service.requests.individualcustomers.CreateIndividualCustomerRequest;
import com.etiya.telcocrm.service.responses.individualcustomers.CreatedIndividualCustomerResponse;
import com.etiya.telcocrm.service.responses.individualcustomers.GetIndividualCustomerResponse;
import com.etiya.telcocrm.service.responses.individualcustomers.GetListIndividualCustomerResponse;
import com.etiya.telcocrm.service.rules.CustomerBusinessRules;
import com.etiya.telcocrm.service.rules.IndividualCustomerBusinessRules;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndividualCustomerServiceImpl implements IndividualCustomerService {

    private final IndividualCustomerRepository individualCustomerRepository;
    private final IndividualCustomerBusinessRules individualCustomerBusinessRules;

    public IndividualCustomerServiceImpl(IndividualCustomerRepository individualCustomerRepository, IndividualCustomerBusinessRules individualCustomerBusinessRules){
        this.individualCustomerRepository = individualCustomerRepository;
        this.individualCustomerBusinessRules = individualCustomerBusinessRules;
    }

    @Override
    public CreatedIndividualCustomerResponse add(CreateIndividualCustomerRequest request) {
        individualCustomerBusinessRules.checkIfIndividualCustomerExistsByIdentityNumber(request.getNationalId());
        IndividualCustomer individualCustomer = IndividualCustomerMapper.INSTANCE.individualCustomerFromCreateIndividualCustomerRequest(request);
        IndividualCustomer createdIndividualCustomer = individualCustomerRepository.save(individualCustomer);
        CreatedIndividualCustomerResponse response =
                IndividualCustomerMapper.INSTANCE.createdIndividualCustomerResponseFromIndividualCustomer(createdIndividualCustomer);
        return response;

    }

    @Override
    public List<GetListIndividualCustomerResponse> getlist() {
        List<IndividualCustomer> individualCustomers = individualCustomerRepository.findAll();
        List<GetListIndividualCustomerResponse> responses =
                IndividualCustomerMapper.INSTANCE.getListIndividualCustomerResponsesFromIndividualCustomers(individualCustomers);
        return responses;
    }

    @Override
    public List<GetListIndividualCustomerResponse> getByLastName(String lastName) {
        List<IndividualCustomer> individualCustomers =
                individualCustomerRepository.findByLastNameIgnoreCase(lastName);
        List<GetListIndividualCustomerResponse> responses =
                IndividualCustomerMapper.INSTANCE.getListIndividualCustomerResponsesFromIndividualCustomers(individualCustomers);
        return responses;
    }

    @Override
    public List<GetListIndividualCustomerResponse> getByFirstNameStartingWith(String prefix) {
        List<IndividualCustomer> individualCustomers =
                individualCustomerRepository.findByFirstNameStartingPrefix(prefix);
        List<GetListIndividualCustomerResponse> responses =
                IndividualCustomerMapper.INSTANCE.getListIndividualCustomerResponsesFromIndividualCustomers(individualCustomers);
        return responses;
    }

    @Override
    public List<GetListIndividualCustomerResponse> getByCustomerNumberPattern(String pattern) {
        List<IndividualCustomer> individualCustomers =
                individualCustomerRepository.findByCustomerNumberPattern(pattern);
        List<GetListIndividualCustomerResponse> responses =
                IndividualCustomerMapper.INSTANCE.getListIndividualCustomerResponsesFromIndividualCustomers(individualCustomers);
        return responses;
    }

    @Override
    public GetIndividualCustomerResponse getById(int id) {
        individualCustomerBusinessRules.checkIfCustomerIdExists(id);
        IndividualCustomer individualCustomer = individualCustomerRepository.findById(id).get();
        GetIndividualCustomerResponse response = IndividualCustomerMapper.INSTANCE.getIndividualCustomerResponseFromIndividualCustomer(individualCustomer);
        return response;
    }


}
