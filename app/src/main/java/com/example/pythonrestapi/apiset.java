package com.example.pythonrestapi;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface apiset {

    @FormUrlEncoded
    @Headers({"X-Parse-REST-API-Key: e2QFUSUeOsXPq1mvRJOGbKDV2ek1ZBllsmJfOlDM",
            "X-Parse-Application-Id: JoLWbQUuuZny8xYKoBzbqzVEH8aJ4bLElz68J4iE"})
    @POST("/users")
    Call<signup_response_model> getregister(@Field("username") String name, @Field("password") String password);

    @FormUrlEncoded
    @POST("/login")
    Call<login_response_model> getlogin(
            @Field("email") String email,
            @Field("password") String password
    );

}
