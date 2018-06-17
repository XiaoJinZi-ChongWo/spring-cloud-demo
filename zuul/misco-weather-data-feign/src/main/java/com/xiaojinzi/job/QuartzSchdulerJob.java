package com.xiaojinzi.job;

import com.xiaojinzi.dataobject.City;
import com.xiaojinzi.service.CityListService;
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


    @Autowired
    private WeatherDataService weatherDataService;

    @Autowired
    private CityListService cityListService;

    /**
     * 天气同步
     * @param jobExecutionContext
     * @throws JobExecutionException
     */
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("【天气入库开始时间】："+ SysNowTimeUtil.getNowTime());
        // 调用城市信息
        List<City> cityList = cityListService.cityList();
        weatherDataService.synWeatherDataCollection(cityList);
        log.info("【天气入库结束时间】："+ SysNowTimeUtil.getNowTime());
    }
}
