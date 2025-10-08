package com.etiya.telcocrm.service.concretes;

import com.etiya.telcocrm.model.entities.City;
import com.etiya.telcocrm.repository.CityRepository;
import com.etiya.telcocrm.service.abstracts.CityService;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public void add(City city) {
        cityRepository.save(city);
    }
}
