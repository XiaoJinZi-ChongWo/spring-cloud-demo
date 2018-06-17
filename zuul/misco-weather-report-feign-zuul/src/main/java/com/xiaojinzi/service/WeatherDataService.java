package com.xiaojinzi.service;

import com.xiaojinzi.dataobject.WeatherResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/12
 * @description
 */
@Service
@FeignClient("misco-weather-api-feign")
public interface WeatherDataService {
    @GetMapping("/weather/{cityName}")
    WeatherResult getWeatherDataByCityName(@PathVariable("cityName") String cityName);
}
