/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.connection;

import org.springframework.stereotype.Service;

/**
 *
 * @author 2108310
 */
@Service
public class OpenWeatherApp implements Provider{
    //4ea669b6c28dc4444e9034d97de9b8e4
    @Override
    public String getUrl(String city) {
        return "https://samples.openweathermap.org/data/2.5/weather?q="+city+"&appid=4ea669b6c28dc4444e9034d97de9b8e4";
    }
    
}
