package com.example.zhaoliang.coolweathertest.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by zhaoliang on 11/07/2017.
 */

public class Basic {
    @JSONField(name = "city")
    public String cityName;
    @JSONField(name = "id")
    public String weatherId;

    public Update update;

    public class Update {
        @JSONField(name = "loc")
        public String updateTime;
    }
}
