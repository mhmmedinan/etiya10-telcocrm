package com.etiya.telcocrm.repository;

import com.etiya.telcocrm.model.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Integer> {

}
