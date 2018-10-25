/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import com.example.services.WeatherAppServices;
import com.example.services.WeatherAppServicesException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2108310
 */
@RestController
@RequestMapping(value = "/weather")
@Service
public class WeatherAPIController {
    @Autowired
    WeatherAppServices services;
    
    @RequestMapping(method = RequestMethod.GET,value="/{city}")
    public ResponseEntity<?> getOrders(@PathVariable("city") String city){
        
        try{
            System.out.println(services.getInfo(city));
            return new ResponseEntity<>(services.getInfo(city),HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(WeatherAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }
}

