package com.amrendra.weather.Repository;

import com.amrendra.weather.Entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface countryRepository extends JpaRepository<Country,Integer> {

}
