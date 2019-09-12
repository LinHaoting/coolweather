package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15986 on 2019/9/10.
 */

public class Forecast {

    public String date;

    @SerializedName("cond_txt_d")
    public String info;

    @SerializedName("tmp_max")
    public String max;

    @SerializedName("tmp_min")
    public String min;
}
