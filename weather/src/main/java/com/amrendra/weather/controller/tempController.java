package com.amrendra.weather.controller;

import com.amrendra.weather.Entity.Temp;
import com.amrendra.weather.Repository.tempRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class tempController {
    @Autowired
    private tempRepository tempRepo;

    @PostMapping("/temp")
    public String addTemp(@RequestBody Temp temp){
        tempRepo.save(temp);
        return "added temp successfully.";
    }
    @GetMapping
    public List<Temp> getAllTemp(){
        List<Temp> temps=tempRepo.findAll();
        return temps;
    }

    @GetMapping("/{id}")
    public Temp getTempById(@PathVariable int id){
        return tempRepo.findById(id).
                orElseThrow(()->new EntityNotFoundException("Temp not found by id:" +id));
    }
    @DeleteMapping("/{id}")
    public String deleteTempById(@PathVariable int id){
        tempRepo.deleteById(id);
        return "Temp by id deleted successfully";
    }
}
