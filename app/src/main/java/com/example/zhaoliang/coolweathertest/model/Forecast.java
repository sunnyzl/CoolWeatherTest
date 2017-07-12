package com.example.zhaoliang.coolweathertest.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by zhaoliang on 11/07/2017.
 */

public class Forecast {

    public String date;
    @JSONField(name = "tmp")
    public Temperature temperature;
    @JSONField(name = "cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @JSONField(name = "txt_d")
        public String info;
    }
}
