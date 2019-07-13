package com.responsi.mvp.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Data {

    private final static String BASE_URL = "https://private-0e6b9-ganjarwidiatmansyah.apiary-mock.com/";

    public static DataService create() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(DataService.class);
    }
}
