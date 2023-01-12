package com.brunaluni.greenheart.GreenHeart.controller;

import com.brunaluni.greenheart.GreenHeart.model.ClothBank;
import com.brunaluni.greenheart.GreenHeart.model.Location;
import com.brunaluni.greenheart.GreenHeart.repository.ClothBankRepository;
import com.brunaluni.greenheart.GreenHeart.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClothBankController {

    @Autowired
    private ClothBankRepository clothBankRepository;

    @PostMapping("/addClothBank")
    ClothBank newLocation(@RequestBody ClothBank newBank) {
        return clothBankRepository.save(newBank);
    }

    @GetMapping("/clothbanks")
    List<ClothBank> getAllLocations() {
        return clothBankRepository.findAll();
    }

}
