package com.zhaoyangmushiyi.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhaoy on 2017/7/15.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
