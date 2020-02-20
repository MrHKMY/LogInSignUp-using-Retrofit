package com.example.android.retrofitandroid;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hakimi on 18/2/2020.
 */
public class RetrofitClient {

    private static final String BASE_URL = "http://192.168.1.38/LoginTest/";
    private static RetrofitClient mInstance;
    private Retrofit retrofit;

    private RetrofitClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitClient getInstance() {
        if (mInstance == null) {
            mInstance = new RetrofitClient();
        }
        return mInstance;
    }

    public JsonPlaceHolderApi getApi() {
        return retrofit.create(JsonPlaceHolderApi.class);
    }
}
