package com.xiaojinzi.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.Reader;
import java.io.StringReader;

/**
 * @author 金全 JQ
 * @version 1.0 , 2018/6/4
 * @description Xml对象转换
 */
public class Xml2ObjList {

    /**
     * 根据类及文件地址进行xml与obj进行pojo转换
     * @param clazz
     * @param xmlStr
     * @return
     * @throws Exception
     */
    public static Object xml2Obj(Class<?> clazz, String xmlStr) throws Exception{
        Object objXml = null;
        Reader reader = null;

        // XML 对象 转换
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        reader = new StringReader(xmlStr);
        objXml = unmarshaller.unmarshal(reader);

        // 流关闭
        if(null != reader){
            reader.close();
        }

        return objXml;
    }
}
