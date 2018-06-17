package com.xiaojinzi.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/12
 * @description
 */
public class SysNowTimeUtil {

    /**
     * 获取当前时间
     * @return
     */
    public static String getNowTime(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return  df.format(new Date());// new Date()为获取当前系统时间
    }
}
