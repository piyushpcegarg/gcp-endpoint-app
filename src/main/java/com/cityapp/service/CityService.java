package com.cityapp.service;

import com.cityapp.entity.City;
import com.cityapp.repository.CityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;

@Service
@Transactional
public class CityService {

  private final CityRepository cityRepository;

  public CityService(CityRepository cityRepository) {
    this.cityRepository = cityRepository;
  }

  public Flux<City> getCities() {

    return cityRepository.findAll();
  }
}
