package com.etiya.telcocrm.controller;

import com.etiya.telcocrm.model.entities.City;
import com.etiya.telcocrm.service.abstracts.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cities")
public class CityController {
    private final CityService cityService;


    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody City city){
        cityService.add(city);
    }
}
