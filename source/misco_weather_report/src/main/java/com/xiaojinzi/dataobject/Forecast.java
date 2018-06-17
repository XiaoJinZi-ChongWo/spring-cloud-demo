package com.xiaojinzi.dataobject;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/3
 * @description 天气预测
 */

@Data
public class Forecast implements Serializable {

    /**　日期 .*/
    private String date;

    /**　最高温度　．*/
    private String high;

    /** 风力 .*/
    private String fengli;

    /**　最低温度 .*/
    private String low;

    /** 风向 .*/
    private String fengxiang;

    /** 天气情况 .*/
    private String type;

}
