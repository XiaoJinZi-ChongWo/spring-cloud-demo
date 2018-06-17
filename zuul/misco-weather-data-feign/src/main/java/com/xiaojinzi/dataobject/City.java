package com.xiaojinzi.dataobject;

import lombok.Data;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/4
 * @description 城市信息
 */
@Data
public class City {

    /** 城市行政区代码 .*/
    private String cityId;

    /** 城市名称 .*/
    private String cityName;

    /** 城市中文拼音 .*/
    private String cityNamePy;

    /** 省区 .*/
    private String province;
}
