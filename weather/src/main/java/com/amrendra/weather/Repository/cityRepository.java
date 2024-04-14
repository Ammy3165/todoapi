package com.amrendra.weather.Repository;

import com.amrendra.weather.Entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cityRepository extends JpaRepository<City,Integer> {

}
