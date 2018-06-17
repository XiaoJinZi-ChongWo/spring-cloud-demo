package com.xiaojinzi.job;

import com.xiaojinzi.dataobject.City;
import com.xiaojinzi.service.WeatherDataService;
import com.xiaojinzi.utils.SysNowTimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/12
 * @description  定时器
 */
@Slf4j
public class QuartzSchdulerJob extends QuartzJobBean {

    private final static String CITY_NAME = "滁州";

    @Autowired
    private WeatherDataService weatherDataService;

    /**
     * 天气同步
     * @param jobExecutionContext
     * @throws JobExecutionException
     */
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("【天气入库开始时间】："+ SysNowTimeUtil.getNowTime());
        //TODO 调用城市信息
        List<City> cityList = new ArrayList<>();
        City city = new City();
        city.setCityId("101220101");
        city.setCityName("合肥");
        city.setProvince("安徽");
        city.setProvince("hefei");
        cityList.add(city);
        weatherDataService.synWeatherDataCollection(cityList);
        log.info("【天气入库结束时间】："+ SysNowTimeUtil.getNowTime());
    }
}
