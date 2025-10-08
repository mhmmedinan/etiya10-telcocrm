package com.etiya.telcocrm.service.abstracts;

import com.etiya.telcocrm.model.entities.City;
import com.etiya.telcocrm.model.entities.District;

import java.util.List;

public interface DistrictService {
    void add(District district);
    List<District> getList();
}
