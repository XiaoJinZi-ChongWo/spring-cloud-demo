package com.xiaojinzi.service;

import com.xiaojinzi.dataobject.City;
import com.xiaojinzi.dataobject.WeatherResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/15
 * @description
 */
@Service
@FeignClient("misco-weather-zuul-client")
public interface DataClientService {

    @GetMapping("/city/city/list")
    List<City> cityList();

    @GetMapping("/weather/weather/{cityName}")
    WeatherResult getWeatherDataByCityName(@PathVariable("cityName") String cityName);
}
