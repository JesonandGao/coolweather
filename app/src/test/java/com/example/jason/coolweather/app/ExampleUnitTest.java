package com.example.jason.coolweather.app;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);

//        String httpUrl = "http://apis.baidu.com/apistore/weatherservice/cityid";
//        String httpArg = "cityid=101260501";
//        final String jsonResult = request(httpUrl, httpArg);
//        Gson gson = new Gson();
//        WeatherInfo info = gson.fromJson(jsonResult, WeatherInfo.class);
//        System.out.println("info - Weather: " + info.getRetData().getL_tmp());
//        System.out.println(jsonResult);

        String httpUrl = "http://apis.baidu.com/apistore/weatherservice/citylist";
        String httpArg = "cityname=%E6%9C%9D%E9%98%B3";
    }
}