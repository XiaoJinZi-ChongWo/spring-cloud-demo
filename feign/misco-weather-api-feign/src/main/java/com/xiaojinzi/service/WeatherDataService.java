package com.xiaojinzi.service;

import com.xiaojinzi.dataobject.WeatherResult;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/12
 * @description
 */
public interface WeatherDataService {
    WeatherResult getWeatherDataByCityName(String cityName);
}
