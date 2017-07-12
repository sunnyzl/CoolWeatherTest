package com.example.zhaoliang.coolweathertest.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by zhaoliang on 11/07/2017.
 */

public class Now {
    @JSONField(name = "tmp")
    public String temperature;
    @JSONField(name = "cond")
    public More more;

    public class More {
        @JSONField(name = "txt")
        public String info;
    }
}
