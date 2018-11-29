package com.example.asus.stefanussuwandi_takehome.api;

import android.content.Intent;

import com.example.asus.stefanussuwandi_takehome.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

    @GET("/search/users")
    Call<ItemResponse> getItems(
            @Query("q") String login);
}
