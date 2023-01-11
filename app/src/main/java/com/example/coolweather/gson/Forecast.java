package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public class More {

        @SerializedName("txt")
        public String info;
    }

    public class Temperature {
        public String max;
        public String min;
    }



}
