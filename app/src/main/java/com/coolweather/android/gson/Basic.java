package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15986 on 2019/9/10.
 */

public class Basic {

    @SerializedName("location")
    public String cityName;

    @SerializedName("cid")
    public String weatherId;


}
