package com.xiaojinzi.dataobject;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/4
 * @description 城市集合
 */
@Data
@XmlRootElement(name = "c")
@XmlAccessorType(XmlAccessType.FIELD)
public class CityList {

    /** 城市结合 .*/
    @XmlElement(name = "d")
    private List<City> cityList;
}
