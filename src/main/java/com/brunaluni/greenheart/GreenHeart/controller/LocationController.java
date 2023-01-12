package com.brunaluni.greenheart.GreenHeart.controller;

import com.brunaluni.greenheart.GreenHeart.model.Category;
import com.brunaluni.greenheart.GreenHeart.model.Location;
import com.brunaluni.greenheart.GreenHeart.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {
    @Autowired
    private LocationRepository locationRepository;


    @PostMapping("/addLocation")
    Location newLocation(@RequestBody Location newLocation) {
        return locationRepository.save(newLocation);
    }

    @GetMapping("/locations")
    List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

}
