package com.xiaojinzi.service;

import com.xiaojinzi.dataobject.City;

import java.util.List;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/12
 * @description Weather Data Service
 */
public interface WeatherDataService {

    /**
     * 天气获取
     * @param cityList
     */
    void synWeatherDataCollection(List<City> cityList);
}
