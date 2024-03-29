package com.masemoel.terremotosapi.webservice;

import com.masemoel.terremotosapi.model.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface WebServiceClient {
    @GET("/earthquakes/feed/v1.0/summary/all_day.geojson")
    Call<Data> getTerremotos();

    @GET()
    Call<Data> getTerremotos(@Url String url);
}