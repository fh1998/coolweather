package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 方慧 on 2020/4/30.
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
