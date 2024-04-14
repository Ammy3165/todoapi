package com.amrendra.weather.Repository;

import com.amrendra.weather.Entity.Temp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tempRepository extends JpaRepository<Temp,Integer> {
}
