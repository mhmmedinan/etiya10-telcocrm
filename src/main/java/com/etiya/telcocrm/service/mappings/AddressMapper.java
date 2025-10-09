package com.etiya.telcocrm.service.mappings;

import com.etiya.telcocrm.model.entities.Address;
import com.etiya.telcocrm.service.responses.address.GetListAddressResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    @Mapping(target="districtName",source = "district.name")
    @Mapping(target="cityName",source = "district.city.name")
    @Mapping(target="customerId",source = "customer.id")
    @Mapping(target="districtId",source = "district.id")
    GetListAddressResponse getListAddressResponseFromAddress(Address address);
}
