/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services.impl;

import com.example.connection.HttpConnection;
import com.example.services.WeatherAppServices;
import com.example.services.WeatherAppServicesException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2108310
 */
@Service
public class WeatherAppServicesImpl implements WeatherAppServices {
    @Autowired
    HttpConnection conection;
    @Override
    public String getInfo(String city) throws WeatherAppServicesException{
        conection.connect(city);
        try {
            conection.run();
            System.out.println("Conecta");
            return conection.getResult();
        } catch (IOException ex) {
            Logger.getLogger(WeatherAppServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new WeatherAppServicesException("ERROR CONECTANDO");
        }
        
    }
    
}
