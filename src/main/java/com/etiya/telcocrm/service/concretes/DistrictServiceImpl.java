package com.etiya.telcocrm.service.concretes;

import com.etiya.telcocrm.model.entities.City;
import com.etiya.telcocrm.model.entities.District;
import com.etiya.telcocrm.repository.CityRepository;
import com.etiya.telcocrm.repository.DistrictRepository;
import com.etiya.telcocrm.service.abstracts.CityService;
import com.etiya.telcocrm.service.abstracts.DistrictService;
import org.springframework.stereotype.Service;

@Service
public class DistrictServiceImpl implements DistrictService {

    private final DistrictRepository districtRepository;

    public DistrictServiceImpl(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    @Override
    public void add(District district) {
        districtRepository.save(district);
    }
}
