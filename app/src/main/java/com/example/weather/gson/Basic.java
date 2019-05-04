package com.example.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 利用GSON进行解析
 * "basic":{
 *     "city":"苏州",
 *     "id":"CN101190401",
 *     "update":{
 *         "loc":"2016-08-08 21:58"
 *     }
 * }
 */
public class Basic {

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
