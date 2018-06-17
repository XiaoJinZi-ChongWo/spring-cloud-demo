package com.xiaojinzi.controller;

import com.xiaojinzi.dataobject.City;
import com.xiaojinzi.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/5
 * @description 天气后台
 */
@Controller
public class WeatherReportController {

    @Autowired
    private WeatherDataService weatherService;

    /**
     * 城市天气后台呈现
     * @param cityName
     * @param model
     * @return
     * @throws Exception
     */
    @GetMapping("/report/{cityName}")
    public ModelAndView weatherReportData(@PathVariable("cityName") String cityName, Model model)throws Exception{
        model.addAttribute("title", "天气预报");
        model.addAttribute("cityName", cityName);
        //TODO
        List<City> cityList = new ArrayList<>();
        City city = new City();
        city.setCityId("101220101");
        city.setCityName("合肥");
        city.setProvince("安徽");
        city.setProvince("hefei");
        cityList.add(city);
        model.addAttribute("cityList",cityList);
        model.addAttribute("report", weatherService.getWeatherDataByCityName(cityName));
        return new ModelAndView("weather/report","reportData",model);
    }
}
