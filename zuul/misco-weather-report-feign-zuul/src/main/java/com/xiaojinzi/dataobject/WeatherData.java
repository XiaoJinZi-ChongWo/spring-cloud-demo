package com.xiaojinzi.dataobject;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/3
 * @description 天气数据
 */

@Data
public class WeatherData  implements Serializable{

    /** 昨日天气情况 .*/
    private Yesterday yesterday;

    /** 未来七日预测 .*/
    private List<Forecast> forecast;

    /** 城市 .*/
    private String city;

    /** 空气指数 .*/
    private String aqi;

    /** 提示 .*/
    private String ganmao;

    /** 温度 .*/
    private String wendu;
}
