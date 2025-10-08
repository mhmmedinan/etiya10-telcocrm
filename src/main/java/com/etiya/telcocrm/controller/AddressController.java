package com.etiya.telcocrm.controller;

import com.etiya.telcocrm.model.entities.Address;
import com.etiya.telcocrm.model.entities.District;
import com.etiya.telcocrm.service.abstracts.AddressService;
import com.etiya.telcocrm.service.abstracts.DistrictService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {
    private final AddressService addressService;


    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Address address){
        addressService.add(address);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Address> getList(){ return addressService.getList();}
}
