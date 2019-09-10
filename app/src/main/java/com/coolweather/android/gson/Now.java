package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15986 on 2019/9/10.
 */

public class Now {

    @SerializedName("temp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
