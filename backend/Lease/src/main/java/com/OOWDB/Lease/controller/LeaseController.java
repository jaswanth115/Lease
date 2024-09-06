package com.OOWDB.Lease.controller;


import com.OOWDB.Lease.dto.HomeResponse;
import com.OOWDB.Lease.model.User;
import com.OOWDB.Lease.service.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class LeaseController {
    
    @Autowired
    LeaseService leaseService;
//    for a user
    @GetMapping("/home")
    public ResponseEntity<HomeResponse> getHomeData(@RequestParam String id){
        return leaseService.getHomeData(id);
    }
    
    
    
}
