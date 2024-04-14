//package com.amrendra.weather.controller;
//
//import com.amrendra.weather.Entity.City;
//import com.amrendra.weather.Repository.cityRepository;
//import jakarta.persistence.EntityNotFoundException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping
//public class cityController {
//    @Autowired
//    private cityRepository cityRepo;
//
//    @PostMapping("/city")
//    public String addCityName(@RequestBody City city){
//        cityRepo.save(city);
//        return "added city name successfully.";
//    }
//
//    @GetMapping
//    public List<City> getAllCity(){
//        List<City> cities= cityRepo.findAll();
//        return cities;
//    }
//
//    @GetMapping("/{id}")
//    public City getCityById(@PathVariable int id){
//        return cityRepo.findById(id).
//                orElseThrow(()->new EntityNotFoundException("City not found by id:" +id));
//    }
//
//    @DeleteMapping("/{id}")
//    public String deleteCityById(@PathVariable int id){
//        cityRepo.deleteById(id);
//        return "City by id deleted successfully";
//    }
//}
