package com.xiaojinzi.dataobject;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/3
 * @description 昨日天气
 */
@Data
public class Yesterday implements Serializable{

    /** 日期 .*/
    private String date;

    /** 最高温度 .*/
    private String high;

    /** 风向 .*/
    private String fx;

    /** 最低温度 .*/
    private String low;

    /** 风力 .*/
    private String fl;

    /** 天气情况 .*/
    private String type;
}
