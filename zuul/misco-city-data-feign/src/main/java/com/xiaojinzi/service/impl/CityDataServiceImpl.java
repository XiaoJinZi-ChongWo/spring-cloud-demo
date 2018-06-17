package com.xiaojinzi.service.impl;

import com.xiaojinzi.dataobject.City;
import com.xiaojinzi.dataobject.CityList;
import com.xiaojinzi.service.CityDataService;
import com.xiaojinzi.utils.Xml2ObjList;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/4
 * @description
 */
@Service
public class CityDataServiceImpl implements CityDataService {

    /**
     * 城市列表获取
     * @return
     * @throws Exception
     */
    @Override
    public List<City> cityList() throws Exception {

        // 获取xml
        Resource resource = new ClassPathResource("citylist.xml");
        BufferedReader bc = new BufferedReader(new InputStreamReader(resource.getInputStream()));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        while ((line = bc.readLine())!=null){
            buffer.append(line);
        }
        bc.close();

        //xmlstr转化obj
        CityList cityList = (CityList) Xml2ObjList.xml2Obj(CityList.class,buffer.toString());

        return cityList.getCityList();
    }
}
