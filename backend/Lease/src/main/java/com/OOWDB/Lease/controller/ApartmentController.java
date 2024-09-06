package com.OOWDB.Lease.controller;


import com.OOWDB.Lease.dto.ApartmentDto;
import com.OOWDB.Lease.model.Apartment;
import com.OOWDB.Lease.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apartment")
public class ApartmentController {
    
    @Autowired
    private ApartmentService apartmentService;
    
    @GetMapping("/getApartments")
    public ResponseEntity<List<ApartmentDto>> getApartments(){
        return apartmentService.getApartments();
    }
    
    @PostMapping("/getApartmentById")
    public ResponseEntity<ApartmentDto> getApartmentById(@RequestParam String id){
        return apartmentService.getApartmentById(id);
    }
    
    @PostMapping("/addApartment")
    public ResponseEntity<ApartmentDto> addApartment(@RequestBody ApartmentDto apartmentDto){
        return apartmentService.addApartment(apartmentDto);
    }
    
}
