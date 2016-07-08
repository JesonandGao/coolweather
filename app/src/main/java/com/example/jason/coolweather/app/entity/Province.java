package com.example.jason.coolweather.app.entity;

/**
 * Created by Jason on 4/9/2016.
 * Province表的实体类
 */
public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {

        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
