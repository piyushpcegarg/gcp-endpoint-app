package com.cityapp.controller;

import com.cityapp.entity.City;
import com.cityapp.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
@RequestMapping(path = "/cities")
public class CityController {

  private final CityService cityService;

  /**
   * Constructor.
   * @param cityService represents city service
   */
  public CityController(CityService cityService) {
    this.cityService = cityService;
  }

  /**
   * Method to get list of cities.
   * @return list of cities
   */
  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public Flux<City> getCities() {

    return cityService.getCities();
  }
}
