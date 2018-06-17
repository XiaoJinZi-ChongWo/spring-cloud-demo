package com.xiaojinzi.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaojinzi.dataobject.WeatherResult;
import com.xiaojinzi.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/12
 * @description 天气获取
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {
    private final static String WEATHER_URL = "http://wthrcdn.etouch.cn/weather_mini?";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public WeatherResult getWeatherDataByCityName(String cityName) {

        String uri = WEATHER_URL + "city=" + cityName;

        ValueOperations<String,String> ops = stringRedisTemplate.opsForValue();
        String jsonper = ops.get(uri);
        ObjectMapper objectMapper = new ObjectMapper();
        WeatherResult result = null;
        try {
            result = objectMapper.readValue(jsonper,WeatherResult.class);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("【数据异常】: Don't has data!");
        }
        return result;
    }
}
