package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 方慧 on 2020/4/30.
 */

public class Basic {
    //运用@SerializeName注解的方式来让JSON字段和Java字段之间建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
