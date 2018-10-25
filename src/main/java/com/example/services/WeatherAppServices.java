/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;

/**
 *
 * @author 2108310
 */
public interface WeatherAppServices {
    public Object getInfo(String city)throws WeatherAppServicesException;
}
