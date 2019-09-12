package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15986 on 2019/9/10.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond_txt")
    public String info;

    @SerializedName("wind_dir")
    public String winddir;

    @SerializedName("wind_sc")
    public String windsc;

}
