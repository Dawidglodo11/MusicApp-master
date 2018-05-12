package com.example.stud.musicapp.api;

import retrofit2.Retrofit;

/**
 * Created by W57119 on 2018-05-12.
 */

public class ApiService {
    public static ApiClient getService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.theaudiodb.com/api/v1/json/1/")
                .build();

        return retrofit.create(ApiClient.class);

    }
}
