package com.xiaojinzi.service;


import com.xiaojinzi.dataobject.City;

import java.util.List;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/4
 * @description
 */
public interface CityDataService {

    /** 获取城市列表 .*/
    List<City> cityList() throws Exception;

}
