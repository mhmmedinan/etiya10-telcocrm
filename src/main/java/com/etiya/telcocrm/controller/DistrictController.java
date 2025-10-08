package com.etiya.telcocrm.controller;

import com.etiya.telcocrm.model.entities.City;
import com.etiya.telcocrm.model.entities.District;
import com.etiya.telcocrm.service.abstracts.CityService;
import com.etiya.telcocrm.service.abstracts.DistrictService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/districts")
public class DistrictController {
    private final DistrictService districtService;


    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody District district){
        districtService.add(district);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<District> getList(){ return districtService.getList();}
}
