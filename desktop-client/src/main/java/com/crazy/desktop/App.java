package com.crazy.desktop;

import com.crazy.common.data.BaiduTransResult;
import com.crazy.common.utils.JsonMapper;
import com.crazy.common.utils.TransApi;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class App {

    public static void main(String[] args) throws IOException {


        URL _resource = App.class.getClassLoader().getResource("application.properties");

        Properties _properties = new Properties();
        _properties.load(_resource.openStream());

        String appid = _properties.getProperty("baidu.appid");
        String security_key = _properties.getProperty("baidu.security_key");

        TransApi _transApi = new TransApi(appid,security_key);

        System.out.println(_transApi.getTransResult("你好", "zh", "en"));

        System.out.println(_transApi.getTransResult("这个世界很冷漠", "zh", "en"));

        String _result  = _transApi.getTransResult("the world to cold", "en", "zh");

        BaiduTransResult _baiduTransResult = JsonMapper.string2Obj(_result, BaiduTransResult.class);


        System.out.println(_baiduTransResult);


    }




}
