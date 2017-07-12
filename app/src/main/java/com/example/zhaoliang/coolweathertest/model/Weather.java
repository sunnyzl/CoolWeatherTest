package com.example.zhaoliang.coolweathertest.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by zhaoliang on 11/07/2017.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;
    @JSONField(name = "daily_forecast")
    public List<Forecast> forecastList;
}
