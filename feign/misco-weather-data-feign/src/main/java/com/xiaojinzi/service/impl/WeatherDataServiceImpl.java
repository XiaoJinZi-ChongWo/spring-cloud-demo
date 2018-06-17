package com.xiaojinzi.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaojinzi.dataobject.City;
import com.xiaojinzi.dataobject.WeatherResult;
import com.xiaojinzi.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.TimeoutUtils;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/12
 * @description
 */

@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    public final static String  WEATHER_URL = "http://wthrcdn.etouch.cn/weather_mini?";

    public final static Long TIME_OUT = 1800l;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 天气获取
     * @param cityList
     */
    @Override
    public void synWeatherDataCollection(List<City> cityList) {
        for(City city : cityList){
            String uri = WEATHER_URL + "city=" + city.getCityName();
            save(uri);
        }
    }

    /**
     * 天气存储
     */
    private void save(String uri){

        ResponseEntity<String> resutl = restTemplate.getForEntity(uri, String.class);

        ValueOperations<String,String> ops = stringRedisTemplate.opsForValue();

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonpaser = null;
        WeatherResult weatherResult = null;

        if(resutl.getStatusCodeValue()==200){
            jsonpaser = resutl.getBody();
        }

        ops.set(uri,jsonpaser,TIME_OUT, TimeUnit.SECONDS);

    }
}
