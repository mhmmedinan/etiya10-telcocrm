package com.etiya.telcocrm.service.abstracts;

import com.etiya.telcocrm.service.requests.individualcustomers.CreateIndividualCustomerRequest;
import com.etiya.telcocrm.service.responses.individualcustomers.CreatedIndividualCustomerResponse;
import com.etiya.telcocrm.service.responses.individualcustomers.GetListIndividualCustomerResponse;

import java.util.List;

public interface IndividualCustomerService {
    //void add(IndividualCustomer individualCustomer);
    CreatedIndividualCustomerResponse add(CreateIndividualCustomerRequest request);
    List<GetListIndividualCustomerResponse> getlist();
    List<GetListIndividualCustomerResponse> findAllWithAddresses();
}
