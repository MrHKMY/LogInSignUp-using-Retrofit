package com.example.android.retrofitandroid;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Hakimi on 18/2/2020.
 */
public interface JsonPlaceHolderApi {

    @FormUrlEncoded
    @POST("register.php")
    Call<String> getUserRegister(
            @Field("Name") String name,
            @Field("Email") String email,
            @Field("Password") String password
    );
}
