package com.etiya.telcocrm.service.abstracts;

import com.etiya.telcocrm.model.entities.IndividualCustomer;
import com.etiya.telcocrm.service.requests.individualcustomers.CreateIndividualCustomerRequest;
import com.etiya.telcocrm.service.responses.individualcustomers.CreatedIndividualCustomerResponse;
import com.etiya.telcocrm.service.responses.individualcustomers.GetIndividualCustomerResponse;
import com.etiya.telcocrm.service.responses.individualcustomers.GetListIndividualCustomerResponse;

import java.util.List;

public interface IndividualCustomerService {
    //void add(IndividualCustomer individualCustomer);
    //List<GetListIndividualCustomerResponse> findAllWithAddresses();
    CreatedIndividualCustomerResponse add(CreateIndividualCustomerRequest request);
    List<GetListIndividualCustomerResponse> getlist();
    List<GetListIndividualCustomerResponse> getByLastName(String lastName);
    List<GetListIndividualCustomerResponse> getByFirstNameStartingWith(String prefix);
    List<GetListIndividualCustomerResponse> getByCustomerNumberPattern(String pattern);

}
