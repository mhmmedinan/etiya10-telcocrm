package com.etiya.telcocrm.service.concretes;

import com.etiya.telcocrm.model.entities.Address;
import com.etiya.telcocrm.model.entities.City;
import com.etiya.telcocrm.model.entities.Customer;
import com.etiya.telcocrm.model.entities.District;
import com.etiya.telcocrm.repository.AddressRepository;
import com.etiya.telcocrm.repository.CityRepository;
import com.etiya.telcocrm.service.abstracts.AddressService;
import com.etiya.telcocrm.service.abstracts.CityService;
import com.etiya.telcocrm.service.requests.address.CreateAddressRequest;
import com.etiya.telcocrm.service.responses.address.CreatedAddressResponse;
import com.etiya.telcocrm.service.responses.address.GetListAddressResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public CreatedAddressResponse add(CreateAddressRequest request) {
        Address address = new Address();

        address.setStreet(request.getStreet());
        address.setHouseNumber(request.getHouseNumber());
        address.setDescription(request.getDescription());
        address.setDefault(request.isDefault());

        //Customeri newleyip id alanına requestten giden alanı setliyoruz
        Customer customer = new Customer();
        customer.setId(request.getCustomerId());

        address.setCustomer(customer);

        District district = new District();
        district.setId(request.getDistrictId());

        address.setDistrict(district);

        Address createdAddress = addressRepository.save(address);

        CreatedAddressResponse response = new CreatedAddressResponse();
        response.setId(createdAddress.getId());
        return response;

    }

    @Override
    public List<GetListAddressResponse> getList() {
        return addressRepository.findAll().stream().map(address -> {
            GetListAddressResponse response = new GetListAddressResponse();
            response.setId(address.getId());
            response.setStreet(address.getStreet());
            response.setHouseNumber(address.getHouseNumber());
            response.setDescription(address.getDescription());
            response.setDefault(address.isDefault());
            response.setDistrictId(address.getDistrict().getId());
            response.setDistrictName(address.getDistrict().getName());
            response.setCityName(address.getDistrict().getCity().getName());
            response.setCustomerId(address.getCustomer().getId());
            return response;
        }).toList();
    }

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }
}
