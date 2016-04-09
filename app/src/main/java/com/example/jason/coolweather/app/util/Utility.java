package com.example.jason.coolweather.app.util;

import android.text.TextUtils;

import com.example.jason.coolweather.app.db.CoolWeatherDB;
import com.example.jason.coolweather.app.model.City;
import com.example.jason.coolweather.app.model.County;
import com.example.jason.coolweather.app.model.Province;

/**
 * Created by Jason on 4/9/2016.
 * 工具类，用于解析和处理 服务器返回的省市县数据(格式：代号|城市，代号|城市)
 */
public class Utility {

    /**
     * 解析和处理服务器返回的省级数据
     */
    public synchronized static boolean handleProvinceResponse(
            CoolWeatherDB coolWeatherDB, String response) {
        if(!TextUtils.isEmpty(response)) {
            String[] allProvinces =response.split(",");
            if (allProvinces != null && allProvinces.length >0) {
                for (String p : allProvinces) {

                    String[] array = p.split("\\|");
                    Province province = new Province();
                    province.setProvinceCode(array[0]);
                    province.setProvinceName(array[1]);
                    //将解析出来的数据存储到Province表
                    coolWeatherDB.saveProvince(province);
                }
                return true;
            }
        }
        return false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     */
    public static boolean handleCitiesResponse(CoolWeatherDB coolWeatherDB,
                                               String response, int ProvinceId) {
        if(!TextUtils.isEmpty(response)) {
            String[] allCities = response.split(",");
            if (allCities != null && allCities.length > 0) {
                for (String c : allCities) {
                    String[] array = c.split("\\|");
                    City city = new City();
                    city.setCityCode(array[0]);
                    city.setCityName(array[1]);
                    city.setProvinceId(ProvinceId);
                    //将解析处理的数据存储到City表
                    coolWeatherDB.saveCity(city);
                }
                return true ;
            }
        }
        return false ;
    }

    /**
     * 解析和处理服务器返回的县级数据
     */
    public static boolean handleCountiesResponse(CoolWeatherDB coolWeatherDB,
                                                 String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            String[] allcounties = response.split(",");
            if (allcounties  != null && allcounties.length > 0) {
                for (String c : allcounties) {
                    String[] array = c.split("\\|");
                    County county = new County();
                    county.setCountyCode(array[0]);
                    county.setCountyName(array[1]);
                    county.setCityId(cityId);
                    //将解析出来的数据存储到County表
                    coolWeatherDB.saveCounty(county);
                }
                return true ;
            }
        }
        return false ;
    }
}


