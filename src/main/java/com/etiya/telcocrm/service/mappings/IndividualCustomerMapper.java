package com.etiya.telcocrm.service.mappings;

import com.etiya.telcocrm.model.entities.IndividualCustomer;
import com.etiya.telcocrm.service.requests.individualcustomers.CreateIndividualCustomerRequest;
import com.etiya.telcocrm.service.responses.individualcustomers.CreatedIndividualCustomerResponse;
import com.etiya.telcocrm.service.responses.individualcustomers.GetIndividualCustomerResponse;
import com.etiya.telcocrm.service.responses.individualcustomers.GetListIndividualCustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = {AddressMapper.class})
public interface IndividualCustomerMapper {

    IndividualCustomerMapper INSTANCE = Mappers.getMapper(IndividualCustomerMapper.class);

    IndividualCustomer individualCustomerFromCreateIndividualCustomerRequest(CreateIndividualCustomerRequest createIndividualCustomerRequest);

    CreatedIndividualCustomerResponse createdIndividualCustomerResponseFromIndividualCustomer(IndividualCustomer individualCustomer);

    List<GetListIndividualCustomerResponse> getListIndividualCustomerResponsesFromIndividualCustomers(List<IndividualCustomer> individualCustomers);
    GetIndividualCustomerResponse getIndividualCustomerResponseFromIndividualCustomer(IndividualCustomer individualCustomer);

}
