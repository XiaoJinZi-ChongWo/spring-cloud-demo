package com.xiaojinzi.dataobject;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/4
 * @description 城市信息
 */
@Data
@XmlRootElement(name = "d")
@XmlAccessorType(XmlAccessType.FIELD)
public class City {

    /** 城市行政区代码 .*/
    @XmlAttribute(name = "d1")
    private String cityId;

    /** 城市名称 .*/
    @XmlAttribute(name = "d2")
    private String cityName;

    /** 城市中文拼音 .*/
    @XmlAttribute(name = "d3")
    private String cityNamePy;

    /** 省区 .*/
    @XmlAttribute(name = "d4")
    private String province;
}
