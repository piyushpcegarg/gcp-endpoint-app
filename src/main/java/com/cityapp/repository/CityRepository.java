package com.cityapp.repository;

import com.cityapp.entity.City;
import org.springframework.cloud.gcp.data.firestore.FirestoreReactiveRepository;

public interface CityRepository extends FirestoreReactiveRepository<City> {

}
