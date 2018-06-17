package com.xiaojinzi.controller;

import com.xiaojinzi.dataobject.WeatherResult;
import com.xiaojinzi.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/12
 * @description
 */
@RestController
public class WeatherDataControler {

    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/weather/{cityName}")
    public WeatherResult weatherResultByCityName(@PathVariable("cityName") String cityName){
        return weatherDataService.getWeatherDataByCityName(cityName);
    }
}
