package com.xiaojinzi.service;

import com.xiaojinzi.dataobject.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/15
 * @description 城市列表feign
 */
@Service
@FeignClient("misco-city-data-eureka")
public interface CityListService {
    @GetMapping("/city/list")
    List<City> cityList();
}
