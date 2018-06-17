package com.xiaojinzi.controller;

import com.xiaojinzi.dataobject.City;
import com.xiaojinzi.service.CityDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/12
 * @description
 */
@RestController
public class CityDataController {

    @Autowired
    private CityDataService cityDataService;

    @GetMapping("/city/list")
    public List<City> cityList()throws Exception{
        return cityDataService.cityList();
    }
}
