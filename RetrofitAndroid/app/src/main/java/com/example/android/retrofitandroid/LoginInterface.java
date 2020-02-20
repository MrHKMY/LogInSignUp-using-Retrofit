package com.example.android.retrofitandroid;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Hakimi on 19/2/2020.
 */
public interface LoginInterface {

    @FormUrlEncoded
    @POST("login.php")
    Call<String> getUserLogin(
            @Field("username") String uname,
            @Field("password") String password
    );
}
