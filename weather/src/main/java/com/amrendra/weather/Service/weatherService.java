package com.amrendra.weather.Service;

import com.amrendra.weather.Repository.weatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class weatherService {
    @Autowired
    private weatherRepository weatherRepo;


}