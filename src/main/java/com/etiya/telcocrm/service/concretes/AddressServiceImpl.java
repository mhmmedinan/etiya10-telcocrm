package com.etiya.telcocrm.service.concretes;

import com.etiya.telcocrm.model.entities.Address;
import com.etiya.telcocrm.model.entities.City;
import com.etiya.telcocrm.repository.AddressRepository;
import com.etiya.telcocrm.repository.CityRepository;
import com.etiya.telcocrm.service.abstracts.AddressService;
import com.etiya.telcocrm.service.abstracts.CityService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public void add(Address address) {
        addressRepository.save(address);
    }
}
