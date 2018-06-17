package com.xiaojinzi.dataobject;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/3
 * @description 数据返回模型
 */

@Data
public class WeatherResult implements Serializable{

    /** 数据 .*/
    private WeatherData data;

    /** 状态码 .*/
    private Integer status;

    /** 描述 .*/
    private String desc;
}
