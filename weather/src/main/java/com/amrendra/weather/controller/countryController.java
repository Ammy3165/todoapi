//package com.amrendra.weather.controller;
//
//import com.amrendra.weather.Entity.Country;
//import com.amrendra.weather.Repository.countryRepository;
//import jakarta.persistence.EntityNotFoundException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping
//public class countryController {
//    @Autowired
//    private countryRepository countryRepo;
//
//    @PostMapping("/country")
//    public String addCountryName(@RequestBody Country country){
//        countryRepo.save(country);
//        return "added country name successfully.";
//    }
//    @GetMapping
//    public List<Country> getAllCountry(){
//        List<Country> countries= countryRepo.findAll();
//        return countries;
//    }
//
//    @GetMapping("/{id}")
//    public Country getCountryById(@PathVariable int id){
//        return countryRepo.findById(id).
//                orElseThrow(()->new EntityNotFoundException("Country not found by id:" +id));
//    }
//    @DeleteMapping("/{id}")
//    public String deleteCountryById(@PathVariable int id){
//        countryRepo.deleteById(id);
//        return "Country by id deleted successfully";
//    }
//
//
//}
