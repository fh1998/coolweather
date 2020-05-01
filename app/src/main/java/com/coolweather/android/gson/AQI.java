package com.coolweather.android.gson;

/**
 * Created by 方慧 on 2020/4/30.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
