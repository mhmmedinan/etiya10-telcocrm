package com.etiya.telcocrm.service.abstracts;

import com.etiya.telcocrm.model.entities.Address;
import com.etiya.telcocrm.model.entities.City;
import com.etiya.telcocrm.service.requests.address.CreateAddressRequest;
import com.etiya.telcocrm.service.responses.address.CreatedAddressResponse;
import com.etiya.telcocrm.service.responses.address.GetListAddressResponse;

import java.util.List;

public interface AddressService {
    //void add(Address address);
    CreatedAddressResponse add(CreateAddressRequest request);
    List<Address> getAll();

    List<GetListAddressResponse> getList();

    void delete(int id);

    void softDelete(int id);
 }
