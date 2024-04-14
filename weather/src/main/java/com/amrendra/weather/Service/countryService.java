package com.amrendra.weather.Service;

import com.amrendra.weather.Repository.countryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class countryService {

    @Autowired
    private countryRepository countryRepo;


}
