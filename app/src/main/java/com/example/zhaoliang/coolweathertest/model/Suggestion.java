package com.example.zhaoliang.coolweathertest.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by zhaoliang on 11/07/2017.
 */

public class Suggestion {
    @JSONField(name = "comf")
    public Comfort comfort;
    @JSONField(name = "cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @JSONField(name = "txt")
        public String info;
    }

    public class CarWash {
        @JSONField(name = "txt")
        public String info;
    }

    public class Sport {
        @JSONField(name = "txt")
        public String info;
    }
}
